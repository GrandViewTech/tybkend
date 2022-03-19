package com.gvt.maverick.confirmation.service.impl;

import com.gvt.maverick.confirmation.schema.allocation.AllocationSchema;
import com.gvt.maverick.confirmation.schema.allocation.RequestAllocationSchema;
import com.gvt.maverick.confirmation.schema.allocation.allocationheader.AllocationHeaderSchema;
import com.gvt.maverick.confirmation.service.AllocationService;
import com.gvt.maverick.confirmation.view.allocation.RequestAllocation;
import com.gvt.maverick.plugin.JaxbPlugin;
import com.gvt.maverick.schema.attribute.*;

import java.util.stream.Collectors;

public class AllocationServiceImpl implements AllocationService {


    private JaxbPlugin<RequestAllocationSchema> jaxbPlugin = new JaxbPlugin<RequestAllocationSchema>(RequestAllocationSchema.class);


    public RequestAllocationSchema getRequestAllocation(RequestAllocation requestAllocation) {
        RequestAllocationSchema requestAllocationSchema = new RequestAllocationSchema();
        requestAllocationSchema.setFpmlVersion("5-9");

        requestAllocationSchema.setCorrelationId(new CorrelationIdSchema(requestAllocation.getCorrelationId()));
        // Header Section

        AllocationHeaderSchema allocationHeaderSchema = new AllocationHeaderSchema();
        allocationHeaderSchema.setCreationTimestamp(requestAllocation.getCreationTimestamp());
        //allocationHeaderSchema.setExpiryTimestamp(requestAllocation.getExpiryTimestamp());
        // Try to include
        //allocationHeaderSchema.setCopyTo(requestAllocation.getCopyTo().stream().map(copy -> new CopyToSchema(copy,"http://www.party2.com/copy-to")).collect(Collectors.toList()));
        //allocationHeaderSchema.setSendTo(requestAllocation.getSendTo().stream().map(sendTo -> new SendToSchema(sendTo,"http://www.party2.com/send-to")).collect(Collectors.toList()));
        allocationHeaderSchema.setSentBy(new SentBySchema(requestAllocation.getSentBy()));
        allocationHeaderSchema.setMessageId(new MessageIdSchema(requestAllocation.getMessageId(),"http://www.party2.com/message-id"));

        // Setting Header's
        requestAllocationSchema.setAllocationHeaderSchema(allocationHeaderSchema);

        return requestAllocationSchema;
    }

    @Override
    public String toFPML(RequestAllocationSchema allocationSchema) {
        try{ return jaxbPlugin.toFpml(allocationSchema);}
        catch(Exception exception){ exception.printStackTrace(); return "";}
    }
}
