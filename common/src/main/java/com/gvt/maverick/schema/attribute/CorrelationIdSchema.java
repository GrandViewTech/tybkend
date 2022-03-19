package com.gvt.maverick.schema.attribute;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;


public class CorrelationIdSchema
{
private String value;
private String correlationIdScheme;

    @XmlValue
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @XmlAttribute(name="correlationIdScheme")
    public String getCorrelationIdScheme() {
        return correlationIdScheme;
    }

    public void setCorrelationIdScheme(String correlationIdScheme) {
        this.correlationIdScheme = correlationIdScheme;
    }


    private CorrelationIdSchema(){}

    public CorrelationIdSchema(String correlationId) {
        this.value = correlationId;
    }

    public CorrelationIdSchema(String correlationId, String correlationIdScheme) {
        this.value = correlationId;
        this.correlationIdScheme = correlationIdScheme;
    }
}
