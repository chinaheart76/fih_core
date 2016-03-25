package com.fih.framework.core.envelope.http.web;

import java.util.Collection;

import com.fih.framework.core.envelope.IEnvelopeElementDescription;
import com.fih.framework.core.envelope.IEnvelopeHeader;
import com.fih.framework.core.envelope.impl.EnvelopeStore;

public class WebEnvelopeHeader extends EnvelopeStore implements IEnvelopeHeader {

	@Override
	public Object set(Object key, Object value) {
		return super.put((String)key, value);
	}
	
	public Object set(String key, Object value) {
		return super.put(key, value);
	}

	@Override
	public Collection<IEnvelopeElementDescription> getDefinitions() {
		// TODO Auto-generated method stub
		return null;
	}

}
