
package com.project.Response.Model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Case {

    private String id;
    private List<Statusentity> statusentity = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Statusentity> getStatusentity() {
        return statusentity;
    }

    public void setStatusentity(List<Statusentity> statusentity) {
        this.statusentity = statusentity;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
