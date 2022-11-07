
package com.project.Response.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Link {

    @SerializedName("rel")
    @Expose
    private String rel;
    @SerializedName("href")
    @Expose
    private String href;
    @SerializedName("profile")
    @Expose
    private String profile;

    public String getRel() {
        return rel;
    }

    public void setRel(String rel) {
        this.rel = rel;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

}
