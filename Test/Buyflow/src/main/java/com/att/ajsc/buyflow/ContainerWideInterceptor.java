/**
 * 
 */
package com.att.ajsc.buyflow;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.model.ProcessorDefinition;
import org.apache.camel.spi.InterceptStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.att.ajsc.common.camel.CamelInterceptor;

/**
 * @author bk436x
 *
 */
public class ContainerWideInterceptor implements InterceptStrategy {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.apache.camel.spi.InterceptStrategy#wrapProcessorInInterceptors(org.
	 * apache.camel.CamelContext, org.apache.camel.model.ProcessorDefinition,
	 * org.apache.camel.Processor, org.apache.camel.Processor)
	 */

	//private static final Logger LOG = LoggerFactory.getLogger(ContainerWideInterceptor.class);

	@Autowired
	private CamelInterceptor interceptor;

	@Override
	public Processor wrapProcessorInInterceptors(final CamelContext context, final ProcessorDefinition<?> definition,
			final Processor target, final Processor nextTarget) throws Exception {

		return new Processor() {
			public void process(Exchange exchange) throws Exception {


				//LOG.info("Exchange Route Id: " + exchange.getUnitOfWork().getRouteContext().getRoute().getId());

				if (exchange.getFromRouteId() != null && (exchange.getFromRouteId().equals(exchange.getUnitOfWork().getRouteContext().getRoute().getId()))) {

					Map headers = exchange.getIn().getHeaders();
					Object transactionIds = headers.get("X-ATT-Transaction-Id");

					if (transactionIds instanceof String) {
						List<String> temp = new ArrayList<String>();
						temp.add((String) transactionIds);
						headers.put("X-ATT-Transaction-Id", temp);
					}

					interceptor.invokepreInterceptorChain(exchange);

					// its important that we delegate to the real target so we
					// let target process the exchange
					target.process(exchange);

					headers = exchange.getIn().getHeaders();

					if (transactionIds instanceof String) {
						List<String> temp = new ArrayList<String>();
						temp.add((String) transactionIds);
						headers.put("X-ATT-Transaction-Id", temp);
					}

					interceptor.invokepostInterceptorChain(exchange);
				} else {
					target.process(exchange);
				}
			}

			@Override
			public String toString() {
				return "ContainerWideInterceptor[" + target + "]";
			}
		};
	}

}