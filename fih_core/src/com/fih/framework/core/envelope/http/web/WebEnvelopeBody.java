package com.fih.framework.core.envelope.http.web;

import java.util.Collection;

import com.fih.framework.core.envelope.IEnvelopeBody;
import com.fih.framework.core.envelope.IEnvelopeElementDescription;
import com.fih.framework.core.envelope.impl.EnvelopeStore;

public class WebEnvelopeBody extends EnvelopeStore implements IEnvelopeBody {

	@Override
	public Object set(Object key, Object value) {
		return super.put((String)key, value);
	}
	
	@Override
	public Collection<IEnvelopeElementDescription> getDefinitions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getStatus() {
		// TODO Auto-generated method stub
		return null;
	}

}
