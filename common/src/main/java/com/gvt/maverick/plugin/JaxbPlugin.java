package com.gvt.maverick.plugin;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

public class JaxbPlugin<T>
{
    private   JAXBContext context;
    private   Marshaller marshaller;

    private JaxbPlugin(){}

    public  JaxbPlugin(Class classz)
    {
        try
        {
            this.context = JAXBContext.newInstance(classz);
            this.marshaller=context.createMarshaller();
            this.marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }

    public String toFpml(T message) throws Exception
    {
        StringWriter writer = new StringWriter();
        this.marshaller.marshal(message,writer);
        String fpml= writer.toString();
        fpml=fpml.replaceAll("ns2:","");
        fpml=fpml.replaceAll("ns2","");
        return fpml;
    }

}
