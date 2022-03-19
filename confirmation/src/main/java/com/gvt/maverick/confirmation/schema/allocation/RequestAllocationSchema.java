package com.gvt.maverick.confirmation.schema.allocation;

import com.gvt.maverick.schema.attribute.CorrelationIdSchema;
import com.gvt.maverick.confirmation.schema.allocation.allocationheader.AllocationHeaderSchema;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author puneetsharma
 * Description :
 */

@XmlRootElement(name = "requestAllocation",namespace = "http://www.fpml.org/FpML-5/confirmation")
public class RequestAllocationSchema extends AllocationSchema
{
    private String fpmlVersion;

    private AllocationHeaderSchema allocationHeaderSchema;

    private Boolean isCorrection=false;

    private CorrelationIdSchema correlationId;

    private Integer sequenceNumber=1;

    @XmlElement(name="sequenceNumber")
    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public CorrelationIdSchema getCorrelationId() {
        return correlationId;
    }

    public void setCorrelationId(CorrelationIdSchema correlationId) {
        this.correlationId = correlationId;
    }

    @XmlElement(name="isCorrection")
    public Boolean getCorrection() {
        return isCorrection;
    }

    public void setCorrection(Boolean correction) {
        this.isCorrection = correction;
    }

    @XmlAttribute
    public String getFpmlVersion() {
        return fpmlVersion;
    }

    public void setFpmlVersion(String fpmlVersion) {
        this.fpmlVersion = fpmlVersion;
    }

    @XmlElement(name="header")
    public AllocationHeaderSchema getAllocationHeaderSchema() {
        return allocationHeaderSchema;
    }

    public void setAllocationHeaderSchema(AllocationHeaderSchema allocationHeaderSchema) {
        this.allocationHeaderSchema = allocationHeaderSchema;
    }
}
