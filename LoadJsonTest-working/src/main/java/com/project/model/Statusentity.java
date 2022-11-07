
package com.project.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Statusentity {

	
    @SerializedName("@id")
    @Expose
    @JsonProperty("@id")

    private String id;
    @SerializedName("ZONE")
    @Expose
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
