
package com.project.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Case {

    @JsonProperty("@id")
 
    private String id;
    
  
  

	private List<Statusentity> statusentity = null;

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

}
