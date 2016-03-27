package com.fih.framework.core.envelope.http.web;

import java.util.Collection;
import java.util.Collections;

import com.fih.framework.core.envelope.IEnvelopeBody;
import com.fih.framework.core.envelope.IEnvelopeElementDescription;
import com.fih.framework.core.envelope.impl.EnvelopeStore;

public class WebEnvelopeBody extends EnvelopeStore implements IEnvelopeBody {

	@Override
	public Object set(Object key, Object value) {
		return super.put((String)key, value);
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

}
