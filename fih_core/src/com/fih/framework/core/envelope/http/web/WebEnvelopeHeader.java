package com.fih.framework.core.envelope.http.web;

import com.fih.framework.core.envelope.IEnvelopeHeader;
import com.fih.framework.core.envelope.impl.EnvelopeStore;

public class WebEnvelopeHeader extends EnvelopeStore implements IEnvelopeHeader {

	@Override
	public String getDescription() {
		return null;
	}

	@Override
	public Object set(Object key, Object value) {
		return super.put((String)key, value);
	}
	
	public Object set(String key, Object value) {
		return super.put(key, value);
	}

}
