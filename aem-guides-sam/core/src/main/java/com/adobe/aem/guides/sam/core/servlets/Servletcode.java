package com.adobe.aem.guides.sam.core.servlets;

import java.io.IOException;

import javax.json.Json;
import javax.json.JsonObjectBuilder;
import javax.servlet.Servlet;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.osgi.service.component.annotations.Component;

@Component(service=Servlet.class,
property= {
		"sling.servlet.paths=/apps/article/sanju",
})
public class Servletcode extends SlingAllMethodsServlet {
	protected void doGet(SlingHttpServletRequest req,SlingHttpServletResponse res)
	throws IOException 
	{
		JsonObjectBuilder object = Json.createObjectBuilder();
		object.add("name","sanju");
		object.add("surname","padidapu");
		object.add("pincode","523114");
		res.getWriter().write(object.build().toString());
	}
}
