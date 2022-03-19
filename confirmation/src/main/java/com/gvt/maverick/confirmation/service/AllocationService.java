package com.gvt.maverick.confirmation.service;

import com.gvt.maverick.confirmation.schema.allocation.AllocationSchema;
import com.gvt.maverick.confirmation.schema.allocation.RequestAllocationSchema;
import com.gvt.maverick.confirmation.view.allocation.RequestAllocation;

public interface AllocationService
{
    public RequestAllocationSchema getRequestAllocation(RequestAllocation requestAllocation);

    public String toFPML(RequestAllocationSchema allocationSchema);
}
