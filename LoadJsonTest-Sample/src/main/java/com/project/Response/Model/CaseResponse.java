
package com.project.Response.Model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class CaseResponse {

    @SerializedName("cases")
    @Expose
    private List<Case> cases = null;
    @SerializedName("summary")
    @Expose
    private Summary summary;
    @SerializedName("links")
    @Expose
    private List<Link> links = null;

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

}
