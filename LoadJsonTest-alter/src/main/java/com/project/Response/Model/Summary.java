
package com.project.Response.Model;

import java.util.HashMap;
import java.util.Map;

public class Summary {

    private Integer casesRead;
    private Integer casesProcessed;
    private Integer casesIgnored;
    private Integer processorDurationSec;
    private Integer processorCasesPerSec;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
