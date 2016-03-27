package com.fih.framework.core.envelope.http.web;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fih.framework.core.envelope.IEnvelope;
import com.fih.framework.core.envelope.IEnvelopeFactory;
import com.fih.framework.core.envelope.excpt.EnvelopeRuntimeException;

public class WebEnvelopeFactory implements IEnvelopeFactory {
	
	HttpServlet servlet;
	HttpServletRequest request;
	HttpServletResponse response;

	public WebEnvelopeFactory(HttpServlet servlet, HttpServletRequest request, HttpServletResponse response) {
		super();
		this.servlet = servlet;
		this.request = request;
		this.response = response;
	}
	
	@SuppressWarnings("unused")
	private WebEnvelopeFactory(){
		super();
	}

	@Override
	public IEnvelope createEnvelope() throws EnvelopeRuntimeException {
		return null;
	}

}
