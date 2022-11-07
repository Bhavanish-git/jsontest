
package com.project.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CaseRequest {

    @SerializedName("outcomes")
    @Expose
    private List<String> outcomes = null;
    @SerializedName("cases")
    @Expose
    private List<Case> cases = null;

    public List<String> getOutcomes() {
        return outcomes;
    }

    public void setOutcomes(List<String> outcomes) {
        this.outcomes = outcomes;
    }

    public List<Case> getCases() {
        return cases;
    }

    public void setCases(List<Case> cases) {
        this.cases = cases;
    }

}
