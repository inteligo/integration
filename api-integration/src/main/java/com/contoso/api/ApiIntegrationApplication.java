package com.contoso.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.contoso.api.integration.client.SOAPConnector;

import com.contoso.api.integration.bpm.wsdl.schema.GetEntitiesUsingSchemaAsString;
import com.contoso.api.integration.bpm.wsdl.schema.GetEntitiesUsingSchemaAsStringResponse;

@SpringBootApplication
public class ApiIntegrationApplication {

	private static final Logger log = LoggerFactory.getLogger(ApiIntegrationApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ApiIntegrationApplication.class, args);
	}

	@Bean
	CommandLineRunner lookup(SOAPConnector soapConnector) {
		return args -> {
			String name = "Sajal";//Default Name
			if(args.length>0){
				name = args[0];
			}
			GetEntitiesUsingSchemaAsString request = new GetEntitiesUsingSchemaAsString();
			request.setEntitiesInfo("<BizAgiWSParam><EntityData><EntityName>tblTransferenciaOC</EntityName><Filters>GuidRegistro = 'TFC-11472-1000112433-2019-07-10_08-30-55-4355'</Filters></EntityData></BizAgiWSParam>");
			StringBuilder str = new StringBuilder();
			str.append("<xs:schema attributeFormDefault=\'qualified\' elementFormDefault=\'qualified\' xmlns:xs=\'http://www.w3.org/2001/XMLSchema\'>");
			str.append("<xs:element name='tblTransferenciaOC'>");
			str.append("<xs:complexType>");
			str.append("<xs:sequence>");
			str.append("<xs:element minOccurs=\'0\' maxOccurs=\'1\' name=\'NumeroCaso\'/>");
			str.append("<xs:element minOccurs=\'0\' maxOccurs=\'1\' name=\'GuidRegistro\' />");
			str.append("<xs:element minOccurs=\'0\' maxOccurs=\'1\' name=\'CodigoRespuesta\' />");
			str.append("<xs:element minOccurs=\'0\' maxOccurs=\'1\' name=\'ComentarioRespuesta\' />");
			str.append("<xs:element minOccurs=\'0\' maxOccurs=\'1\' name=\'Comision\' />");
			str.append("<xs:element minOccurs=\'0\' maxOccurs=\'1\' name=\'TransaccionT24\' />");
			str.append("</xs:sequence>");
			str.append("</xs:complexType>");
			str.append("</xs:element>");
			str.append("</xs:schema>");
			request.setSchema(str.toString());

			String url= "http://172.18.10.95/bpm/WebServices/EntityManagerSOA.asmx?wsdl";
			String soapAction= "http://tempuri.org/getEntitiesUsingSchemaAsString";

			ObjectMapper mapper = new ObjectMapper();

			GetEntitiesUsingSchemaAsStringResponse response =(GetEntitiesUsingSchemaAsStringResponse) soapConnector.callWebService(url, request,soapAction);
			String jsonString = mapper.writeValueAsString(response);

			log.info("Got Response As below ========= : "+jsonString);

		};
	}
}
