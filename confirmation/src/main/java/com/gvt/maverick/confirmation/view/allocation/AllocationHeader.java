package com.gvt.maverick.confirmation.view.allocation;


import com.gvt.maverick.schema.attribute.*;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AllocationHeader
{
    private MessageIdSchema messageId;

    private List<SendToSchema> sendTo= new ArrayList<>();

    private List<CopyToSchema> copyTo= new ArrayList<>();

    private SentBySchema sentBy;

    private Date creationTimestamp;

    private Date expiryTimestamp;




    @XmlElement(name = "messageId")
    public MessageIdSchema getMessageId() {
        return messageId;
    }

    public void setMessageId(MessageIdSchema messageId) {
        this.messageId = messageId;
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

    public List<SendToSchema> getSendTo() {
        return sendTo;
    }

    public void setSendTo(List<SendToSchema> sendTo) {
        this.sendTo = sendTo;
    }

    public List<CopyToSchema> getCopyTo() {
        return copyTo;
    }

    public void setCopyTo(List<CopyToSchema> copyTo) {
        this.copyTo = copyTo;
    }

    public SentBySchema getSentBy() {
        return sentBy;
    }

    public void setSentBy(SentBySchema sentBy) {
        this.sentBy = sentBy;
    }
}
