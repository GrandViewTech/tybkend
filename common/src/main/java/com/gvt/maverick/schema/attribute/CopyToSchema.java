package com.gvt.maverick.schema.attribute;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name="copyTo")
public class CopyToSchema {


    private String value;

    private String messageAddressScheme;

    @XmlValue
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    @XmlAttribute
    public String getMessageAddressScheme() {
        return messageAddressScheme;
    }

    public void setMessageAddressScheme(String messageAddressScheme) {
        this.messageAddressScheme = messageAddressScheme;
    }

    public CopyToSchema(String value) {
        this.value = value;
    }

    public CopyToSchema(String value, String messageAddressScheme) {
        this.messageAddressScheme = messageAddressScheme;
        this.value = value;
    }

    public CopyToSchema() {
    }
}
