
package com.project.model;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


@Component
public class Statusentity {

	
    @SerializedName("@id")
    @Expose
    @JsonProperty("@id")

    private String id;
    @SerializedName("ZONE")
    @Expose
    @JsonProperty("ZONE")
    private String zone;

    public Statusentity() {
		super();
	}

	public Statusentity(String id, String zone) {
		super();
		this.id = id;
		this.zone = zone;
	}

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
