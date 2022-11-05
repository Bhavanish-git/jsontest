
package com.project.Response.Model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class CaseResponse {

    private List<Case> cases = null;
    private Summary summary;
    private List<Link> links = null;
    
    
    @Override
	public String toString() {
		return "CaseResponse [cases=" + cases + ", summary=" + summary + ", links=" + links + ", additionalProperties="
				+ additionalProperties + "]";
	}

	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public List<Case> getCases() {
        return cases;
    }

    public void setCases(List<Case> cases) {
        this.cases = cases;
    }

    public Summary getSummary() {
        return summary;
    }

    public void setSummary(Summary summary) {
        this.summary = summary;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
