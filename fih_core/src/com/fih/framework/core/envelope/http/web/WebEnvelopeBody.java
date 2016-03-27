package com.fih.framework.core.envelope.http.web;

import java.util.Collection;
import java.util.Collections;

import com.fih.framework.core.envelope.IEnvelope;
import com.fih.framework.core.envelope.IEnvelopeBody;
import com.fih.framework.core.envelope.IEnvelopeElementDescription;
import com.fih.framework.core.envelope.IEnvelopeHeader;
import com.fih.framework.core.envelope.impl.EnvelopeStore;

public class WebEnvelopeBody extends EnvelopeStore implements IEnvelopeBody {

	IEnvelope envelope = null;

	public WebEnvelopeBody(IEnvelope envelope) {
		super();
		this.envelope = envelope;
	}
	
	@SuppressWarnings("unused")
	private WebEnvelopeBody(){
		super();
	}

	@SuppressWarnings("unchecked")
	@Override
	public Collection<IEnvelopeElementDescription> getDefinitions() {
		return (Collection<IEnvelopeElementDescription>) super.get("definitions");

	}

	public void addDefinition(IEnvelopeElementDescription definition){
		
		Collection<IEnvelopeElementDescription> definitions = getDefinitions();
		
		if(null == definitions){
			definitions = Collections.emptySet();
		}
		
		definitions.add(definition);
		
	}

	@Override
	public String getStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IEnvelopeHeader getHeader() {
		return envelope.getHeader();
	}

	@Override
	public IEnvelope getEnvelope() {
		return envelope;
	}

}
