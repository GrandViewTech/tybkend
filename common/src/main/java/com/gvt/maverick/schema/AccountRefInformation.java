package com.gvt.maverick.schema;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="account")
public class AccountRefInformation
{
    private String id;
    private String accountId;
    private String accountName;
}
