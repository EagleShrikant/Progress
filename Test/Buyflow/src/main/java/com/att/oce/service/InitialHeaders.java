package com.att.oce.service;

import java.util.Map;

import org.apache.camel.Exchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InitialHeaders {

	//private Logger logger = LoggerFactory.getLogger(InitialHeaders.class);
	
	public final void setHeaders(Exchange e) {
		
		Map<String, Object> headers = e.getIn().getHeaders();
		//List headersList = (List)e.getIn().getHeader("org.restlet.http.headers");
//		for(Object m : headersList){
//			logger.debug("Header Name : " +((Parameter)m).getFirst());
//			logger.debug("Header Value : " +((Parameter)m).getSecond());
//			if(((Parameter)m).getFirst().equals("Content-Type")){
//				headers.put(((Parameter)m).getFirst(), ((Parameter)m).getSecond());
//			}	
//			if(((Parameter)m).getFirst().equals("Accept")){
//				headers.put(((Parameter)m).getFirst(), ((Parameter)m).getSecond());
//			}	
//			if(((Parameter)m).getFirst().equals("csp-attuid")){
//				headers.put(((Parameter)m).getFirst(), ((Parameter)m).getSecond());
//			}
//		}				
		
		//headers.put("accept", value)

		e.getIn().setHeaders(headers);
	}
	
	
}
