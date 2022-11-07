
package com.project.Response.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Summary {

    @SerializedName("casesRead")
    @Expose
    private Integer casesRead;
    @SerializedName("casesProcessed")
    @Expose
    private Integer casesProcessed;
    @SerializedName("casesIgnored")
    @Expose
    private Integer casesIgnored;
    @SerializedName("processorDurationSec")
    @Expose
    private Integer processorDurationSec;
    @SerializedName("processorCasesPerSec")
    @Expose
    private Integer processorCasesPerSec;

    public Integer getCasesRead() {
        return casesRead;
    }

    public void setCasesRead(Integer casesRead) {
        this.casesRead = casesRead;
    }

    public Integer getCasesProcessed() {
        return casesProcessed;
    }

    public void setCasesProcessed(Integer casesProcessed) {
        this.casesProcessed = casesProcessed;
    }

    public Integer getCasesIgnored() {
        return casesIgnored;
    }

    public void setCasesIgnored(Integer casesIgnored) {
        this.casesIgnored = casesIgnored;
    }

    public Integer getProcessorDurationSec() {
        return processorDurationSec;
    }

    public void setProcessorDurationSec(Integer processorDurationSec) {
        this.processorDurationSec = processorDurationSec;
    }

    public Integer getProcessorCasesPerSec() {
        return processorCasesPerSec;
    }

    public void setProcessorCasesPerSec(Integer processorCasesPerSec) {
        this.processorCasesPerSec = processorCasesPerSec;
    }

}
