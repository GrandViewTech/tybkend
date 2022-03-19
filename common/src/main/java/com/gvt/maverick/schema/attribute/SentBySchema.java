package com.gvt.maverick.schema.attribute;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name="sentBy")
public class SentBySchema {


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

    public SentBySchema(String value) {
        this.value = value;
    }

    public SentBySchema(String value, String messageAddressScheme) {
        this.messageAddressScheme = messageAddressScheme;
        this.value = value;
    }

    public SentBySchema() {
    }
}
