package com.gvt.maverick.confirmation.view;

import com.gvt.maverick.confirmation.schema.allocation.RequestAllocationSchema;
import com.gvt.maverick.confirmation.service.AllocationService;
import com.gvt.maverick.confirmation.service.impl.AllocationServiceImpl;
import com.gvt.maverick.confirmation.view.allocation.RequestAllocation;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class AllocationTestCase
{

    private AllocationService allocationService = new AllocationServiceImpl();

    // Reference :
    // 1. https://www.fpml.org/spec/fpml-5-9-2-wd-2/html/confirmation/xml/business-processes/allocation/msg-ex20-cds-request-allocation.xml
    // 2. https://www.fpml.org/spec/fpml-5-10-5-rec-1/html/confirmation/schemaDocumentation/schemas/fpml-confirmation-processes-5-10_xsd/elements/requestAllocation.html
    @Test
    public void requestAllocationTestCase() throws  Exception
    {
        String id= UUID.randomUUID().toString();
        RequestAllocation requestAllocation = new RequestAllocation();
        requestAllocation.setFpmlVersion("5-9");
        List<String> parties = new ArrayList<>();
        parties.add("PARTY2");
        //parties.add("PARTY3");
        requestAllocation.setCopyTo(parties);
        requestAllocation.setSendTo(parties);
        requestAllocation.setSentBy("PARTY1");
        requestAllocation.setCreationTimestamp(new Date());
        requestAllocation.setExpiryTimestamp(new Date());
        requestAllocation.setCorrelationId(id);
        requestAllocation.setMessageId(id);
        RequestAllocationSchema requestAllocationSchema=allocationService.getRequestAllocation(requestAllocation);
        String fpml = allocationService.toFPML(requestAllocationSchema);
        System.out.println(fpml);
    }

}
