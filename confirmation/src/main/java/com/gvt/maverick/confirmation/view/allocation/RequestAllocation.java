package com.gvt.maverick.confirmation.view.allocation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author puneetsharma
 * Description :
 */


public class RequestAllocation
{
    private String fpmlVersion;

    private String messageId;

    private AllocationHeader allocationHeader;

    private Boolean isCorrection=false;

    private String correlationId;

    private Integer sequenceNumber=1;

    private Date creationTimestamp;

    private Date expiryTimestamp;

    private String sentBy ;

    private List<String> sendTo = new ArrayList<>();

    private List<String> copyTo = new ArrayList<>();

    public String getFpmlVersion() {
        return fpmlVersion;
    }

    public void setFpmlVersion(String fpmlVersion) {
        this.fpmlVersion = fpmlVersion;
    }

    public AllocationHeader getAllocationHeader() {
        return allocationHeader;
    }

    public void setAllocationHeader(AllocationHeader allocationHeader) {
        this.allocationHeader = allocationHeader;
    }

    public Boolean getCorrection() {
        return isCorrection;
    }

    public void setCorrection(Boolean correction) {
        isCorrection = correction;
    }

    public String getCorrelationId() {
        return correlationId;
    }

    public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
    }

    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public Date getCreationTimestamp() {
        return creationTimestamp;
    }

    public void setCreationTimestamp(Date creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    public Date getExpiryTimestamp() {
        return expiryTimestamp;
    }

    public void setExpiryTimestamp(Date expiryTimestamp) {
        this.expiryTimestamp = expiryTimestamp;
    }

    public String getSentBy() {
        return sentBy;
    }

    public void setSentBy(String sentBy) {
        this.sentBy = sentBy;
    }

    public List<String> getSendTo() {
        return sendTo;
    }

    public void setSendTo(List<String> sendTo) {
        this.sendTo = sendTo;
    }

    public List<String> getCopyTo() {
        return copyTo;
    }

    public void setCopyTo(List<String> copyTo) {
        this.copyTo = copyTo;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }
}
