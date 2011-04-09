package com.hoover.portlet;

import java.io.IOException;

import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

public class HelloWorldController extends GenericPortlet {
	@Override
	protected void doView(RenderRequest request, RenderResponse response)
			throws PortletException, IOException {
getPortletContext().getRequestDispatcher("/WEB-INF/jsp/HelloWorld.jsp").include(request,response);
	}
}
