
package com.project.Response.Model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResCase {

    @SerializedName("@id")
    @Expose
    @JsonProperty("@id")
    private String id;
    @SerializedName("statusentity")
    @Expose
    private List<StatusentityRes> statusentity = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<StatusentityRes> getStatusentity() {
        return statusentity;
    }

    public void setStatusentity(List<StatusentityRes> statusentity) {
        this.statusentity = statusentity;
    }

}
