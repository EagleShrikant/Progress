package com.att.oce.buyflow.service;


import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.apache.camel.Exchange;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;

public class BuyflowServiceImpl {

	@Path("/buyflow")
	@GET
	@ApiOperation(
			value = "Get the testvalue based on the searchString",
			notes = "The test value is based on the  etc, etc "
					+ "All failures would be logged for reporting purpose. ",
			response = JSONObject.class
	)
	
	@ApiResponses(
			value = {
					@ApiResponse(code = 400, message = "Bad Request. Please verify your input"),
					@ApiResponse(code = 404, message = "Service not available"),
					@ApiResponse(code = 500, message = "Unexpected Runtime error")
					})
	public final void defaultMethod(Exchange e){
		JSONParser parser = new JSONParser();

        try {
        	ClassLoader classLoader = getClass().getClassLoader();
            Object obj = parser.parse(new InputStreamReader(new FileInputStream(classLoader.getResource("HISADEFAULTJSON.js").getFile())));

            org.json.simple.JSONObject jsonObject = (JSONObject) obj;
            System.out.println(jsonObject);

            //String name = (String) jsonObject.get("name");
            //System.out.println(name);

            //long age = (Long) jsonObject.get("age");
            //System.out.println(age);
            
            e.getOut().setHeaders(e.getIn().getHeaders());
            e.getOut().setHeader("Content-Type", "application/json");
            e.getOut().setBody(jsonObject.toJSONString());

        } catch (org.json.simple.parser.ParseException | IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	
	@Path("/buyflow/plandetails")
	@GET
	@ApiOperation(
			value = "Get the testvalue based on the searchString",
			notes = "The test value is based on the  etc, etc "
					+ "All failures would be logged for reporting purpose. ",
			response = JSONObject.class
	)
	
	@ApiResponses(
			value = {
					@ApiResponse(code = 400, message = "Bad Request. Please verify your input"),
					@ApiResponse(code = 404, message = "Service not available"),
					@ApiResponse(code = 500, message = "Unexpected Runtime error")
					})
	public final void getPlanDetails(Exchange e){
		JSONParser parser = new JSONParser();

        JSONObject jsonObject = null;
        try {
			jsonObject = (JSONObject) parser.parse(e.getIn().getBody().toString());
			System.out.println(jsonObject.toString());
		} catch (org.json.simple.parser.ParseException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		e.getOut().setHeaders(e.getIn().getHeaders());
		e.getOut().setHeader("Content-Type", "application/json");
		e.getOut().setBody(jsonObject.toString());
	}
}
