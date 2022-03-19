package com.gvt.maverick.schema.attribute;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

public class MessageIdSchema
{
    private String messageIdScheme="http://www.party2.com/message-id";
    private String value;

    @XmlAttribute
    public String getMessageIdScheme() {
        return messageIdScheme;
    }

    public void setMessageIdScheme(String messageIdScheme) {
        this.messageIdScheme = messageIdScheme;
    }

    @XmlValue
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public MessageIdSchema(String value) {
        this.value = value;
    }

    public MessageIdSchema(String value, String messageIdScheme) {
        this.messageIdScheme = messageIdScheme;
        this.value = value;
    }
}
