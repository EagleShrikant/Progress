package com.att.oce.buyflow.beanimpl;

import org.springframework.stereotype.Component;

import com.att.oce.buyflow.bean.TestBean;
import com.att.oce.buyflow.vo.TestBeanVO;

@Component
public class TestBeanImpl implements TestBean {

	@Override
	public TestBeanVO testMethod1() {
		TestBeanVO objTestBeanVO = new TestBeanVO();
		objTestBeanVO.setTestID(10);
		objTestBeanVO.setTestString("Shrikant");
		return objTestBeanVO;
	}

	@Override
	public TestBeanVO testMethod2(TestBeanVO objTestBeanVO) {
		TestBeanVO objLocTestBeanVO = new TestBeanVO();
		objLocTestBeanVO.setTestID(objTestBeanVO.getTestID());
		objLocTestBeanVO.setTestString(objTestBeanVO.getTestString());
		return objLocTestBeanVO;
	}

}
