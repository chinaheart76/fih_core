package com.fih.framework.core.envelope.http.web;

import com.fih.framework.core.envelope.IEnvelopeBody;
import com.fih.framework.core.envelope.impl.EnvelopeStore;

public class WebEnvelopeBody extends EnvelopeStore implements IEnvelopeBody {

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
