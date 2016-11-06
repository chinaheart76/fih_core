package com.fih.framework.core.envelope.http.web;

import com.fih.framework.core.context.IContext;
import com.fih.framework.core.envelope.IEnvelope;
import com.fih.framework.core.envelope.IEnvelopeBody;
import com.fih.framework.core.envelope.IEnvelopeHeader;

public class WebEnvelope implements IEnvelope {
	
	private WebEnvelopeHeader header = null;
	private WebEnvelopeBody body = null;
	private IContext context = null;
	
	WebEnvelope(IContext context,WebEnvelopeHeader header,WebEnvelopeBody body){
		this.context = context;
		this.header = header;
		this.body = body;
	}
	
	private WebEnvelope(){
		
	}

	@Override
	public IContext getContext() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IEnvelopeHeader getHeader() {
		return this.header;
	}

	@Override
	public IEnvelopeBody getBody() {
		return this.body;
	}

}
