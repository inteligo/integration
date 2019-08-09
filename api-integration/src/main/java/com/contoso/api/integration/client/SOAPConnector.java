
package com.contoso.api.integration.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class SOAPConnector extends WebServiceGatewaySupport {

	private static final Logger log = LoggerFactory.getLogger(SOAPConnector.class);

	public Object callWebService(String url, Object request,String soapAction){

		return getWebServiceTemplate().marshalSendAndReceive(url, request,
				new SoapActionCallback(
						soapAction));
	}
}
