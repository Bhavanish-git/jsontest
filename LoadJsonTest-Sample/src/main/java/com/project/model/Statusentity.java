
package com.project.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Statusentity {

    @JsonProperty("@id")
   
    private String id;
    @JsonProperty("ZONE")
   
    private String zone;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

}
