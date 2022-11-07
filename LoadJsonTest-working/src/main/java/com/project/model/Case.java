
package com.project.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Case {

    @SerializedName("@id")
    @Expose
    @JsonProperty("@id")

    private String id;
    @SerializedName("statusentity")
    @Expose
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
