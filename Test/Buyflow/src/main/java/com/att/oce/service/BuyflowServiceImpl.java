package com.att.oce.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.apache.camel.Exchange;





import generated.NEWVOIPINTERENTINDIRECTV2HSIANew;
import generated.NEWVOIPINTERENTINDIRECTV2HSIANew.Data.Order.Accounts.Account;
import generated.NEWVOIPINTERENTINDIRECTV2HSIANew.Data.Order.Accounts.Account.BillingDetail;
import generated.NEWVOIPINTERENTINDIRECTV2HSIANew.Data.Order.Accounts.Account.CreditCheck;
import generated.NEWVOIPINTERENTINDIRECTV2HSIANew.Data.Order.Accounts.Account.BillingDetail.Authentication;
import generated.NEWVOIPINTERENTINDIRECTV2HSIANew.Data.Order.Accounts.Account.BillingDetail.Authentication.SecurityVerification;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;

public class BuyflowServiceImpl {

	@Path("/testpath")
	@GET
	@ApiOperation(
			value = "Get the testvalue based on the searchString",
			notes = "The test value is based on the  etc, etc "
					+ "All failures would be logged for reporting purpose. ",
			response = NEWVOIPINTERENTINDIRECTV2HSIANew.class
	)
	
	@ApiResponses(
			value = {
					@ApiResponse(code = 400, message = "Bad Request. Please verify your input"),
					@ApiResponse(code = 404, message = "Service not available"),
					@ApiResponse(code = 500, message = "Unexpected Runtime error")
					})
	public final void testMethod(Exchange e){
		NEWVOIPINTERENTINDIRECTV2HSIANew objTest = (NEWVOIPINTERENTINDIRECTV2HSIANew) e.getIn().getBody();
		
		objTest = new NEWVOIPINTERENTINDIRECTV2HSIANew();
	
		List<NEWVOIPINTERENTINDIRECTV2HSIANew.Data.Order.Accounts.Account> accountList = objTest.getData().getOrder().getAccounts().getAccount();
		
		e.getOut().setHeaders(e.getIn().getHeaders());
		e.getOut().setBody(objTest);
	}
	
	
	public Account getUVAccount() {
		Account objUVAccount = new Account();
		
		objUVAccount.setAccountCategory("UVERSE_ACCOUNT");
		objUVAccount.setAccountSubCategory("NEW");
		objUVAccount.setAccountSubType("R");
		objUVAccount.setAccountType("INDIVIDUAL");
		objUVAccount.setB2BReference("");
		objUVAccount.setBillingDeliveryPreference("PAPER");
		
		
		BillingDetail objBillingDetail = new BillingDetail();
		objBillingDetail.setAddressReference("ADDRESS_02");
		
		Authentication objAuthentication = new Authentication();
		objAuthentication.setDob("Encoded Value");
		objAuthentication.setLastFourOfSSN("ETK92326I");
		objAuthentication.setSsn(null);
		
		SecurityVerification objSecurityVerification = new SecurityVerification();
		objSecurityVerification.setPin("78uB");
		objSecurityVerification.setSecurityQuestion("What is your favorite restaurant?");
		objSecurityVerification.setSecurityAnswer("Encoded Value");
		
		objAuthentication.setSecurityVerification(objSecurityVerification);
		
		objBillingDetail.setAuthentication(objAuthentication);
		objBillingDetail.setNameReference("NAME_01");
				
		objUVAccount.getBillingDetail().add(objBillingDetail);
		objUVAccount.setCpni("true");
		
		CreditCheck objCreditCheck = new CreditCheck();
		objCreditCheck.setCreditCheckManagementTransactionId("U20170912720229517");
		objCreditCheck.setCreditCheckRanIndicator("true");
		objCreditCheck.setCreditClass("MEDIUM");
		objCreditCheck.setElectronicIdNumber("U20170912720229517");
		objCreditCheck.setSafeScanAlertIndicator("false");
		objCreditCheck.setSafeScanPassIndicator("false");
		objCreditCheck.setSingleCreditQueryWirelessIndicator("false");
		
		
		
		objUVAccount.setCreditCheck(objCreditCheck);
		objUVAccount.setGigaPower("N");
		
		objUVAccount.setId("ACCOUNT_01");
		objUVAccount.setLangId("ENGLISH");
		objUVAccount.setPassCode("78uB");
		objUVAccount.setPaymentArrangement("POSTPAID");
		objUVAccount.setSequence(1);
		objUVAccount.setServiceLocationReference("ADDRESS_01");
		objUVAccount.setSpokenLanguagePreference("ENGLISH");
		
		return objUVAccount;
	}
	
	public Account getDTVAccount() {
		Account objUVAccount = new Account();
		
		objUVAccount.setAccountCategory("MOBILITY_ACCOUNT");
		objUVAccount.setAccountSubCategory("EXISTING");
		objUVAccount.setAccountSubType("R");
		objUVAccount.setAccountType("INDIVIDUAL");
		objUVAccount.setB2BReference("");
		objUVAccount.setBillingDeliveryPreference("PAPER");
		
		
		BillingDetail objBillingDetail = new BillingDetail();
		objBillingDetail.setAddressReference("ADDRESS_01");
		
		Authentication objAuthentication = new Authentication();
		objAuthentication.setDob("Encoded Value");
		objAuthentication.setLastFourOfSSN("TJ6JA7TYU");
		objAuthentication.setSsn(null);
		
		SecurityVerification objSecurityVerification = new SecurityVerification();
		objSecurityVerification.setPin("78uB");
		objSecurityVerification.setSecurityQuestion("What is your favorite restaurant?");
		objSecurityVerification.setSecurityAnswer("Encoded Value");
		
		objAuthentication.setSecurityVerification(objSecurityVerification);
		
		objBillingDetail.setAuthentication(objAuthentication);
		objBillingDetail.setNameReference("NAME_01");
				
		objUVAccount.getBillingDetail().add(objBillingDetail);
		objUVAccount.setCpni("true");
		
		CreditCheck objCreditCheck = new CreditCheck();
		objCreditCheck.setCreditCheckManagementTransactionId("U20170912720229517");
		objCreditCheck.setCreditCheckRanIndicator("true");
		objCreditCheck.setCreditClass("MEDIUM");
		objCreditCheck.setElectronicIdNumber("U20170912720229517");
		objCreditCheck.setSafeScanAlertIndicator("false");
		objCreditCheck.setSafeScanPassIndicator("false");
		objCreditCheck.setSingleCreditQueryWirelessIndicator("false");
		
		
		objUVAccount.setCreditCheck(objCreditCheck);
		objUVAccount.setGigaPower("N");
		
		objUVAccount.setId("ACCOUNT_01");
		objUVAccount.setLangId("ENGLISH");
		objUVAccount.setPassCode("78uB");
		objUVAccount.setPaymentArrangement("POSTPAID");
		objUVAccount.setSequence(1);
		objUVAccount.setServiceLocationReference("ADDRESS_01");
		objUVAccount.setSpokenLanguagePreference("ENGLISH");
		
		return objUVAccount;
	}
	
	
	public int generateNewNumber(){
		
		FileReader fr = new FileReader("generator.txt");
		BufferedReader br = new BufferedReader(objFile);

		String sCurrentLine;

		while ((sCurrentLine = br.readLine()) != null) {
			if()
		}
	}
}
