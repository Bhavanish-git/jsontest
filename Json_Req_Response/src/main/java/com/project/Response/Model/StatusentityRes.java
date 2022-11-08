
package com.project.Response.Model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
@JsonInclude(Include.NON_NULL)

public class StatusentityRes {

    @SerializedName("@id")
    @JsonProperty("@id")
    @Expose
    private String id;
    
    @SerializedName("ACTIVE_STATUS")
    @Expose
    @JsonProperty("ACTIVE_STATUS")
    private String activeStatus;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getactiveStatus() {
        return activeStatus;
    }

    public void setactiveStatus(String activeStatus) {
        this.activeStatus = activeStatus;
    }

}
