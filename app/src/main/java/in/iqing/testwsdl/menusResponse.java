package in.iqing.testwsdl;

//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 4.5.7.0
//
// Created by Quasar Development at 20/06/2016
//
//---------------------------------------------------


import org.ksoap2.serialization.*;

import java.util.Hashtable;

public class menusResponse extends AttributeContainer implements KvmSerializable
{

    
    public Integer code;
    
    public String hint;

    public menusResponse ()
    {
    }

    public menusResponse (Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
    {
	    
	    if (paramObj == null)
            return;
        AttributeContainer inObj=(AttributeContainer)paramObj;


        if(inObj instanceof SoapObject)
        {
            SoapObject soapObject=(SoapObject)inObj;
            int size = soapObject.getPropertyCount();
            for (int i0=0;i0< size;i0++)
            {
                //if you have compilation error here, please use a ksoap2.jar and ExKsoap2.jar from libs folder (in the generated zip file)
                PropertyInfo info=soapObject.getPropertyInfo(i0);
                Object obj = info.getValue();
                if (info.name.equals("code"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.code = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.code = (Integer)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("hint"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.hint = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.hint = (String)obj;
                        }
                    }
                    continue;
                }

            }

        }



    }

    @Override
    public Object getProperty(int propertyIndex) {
        //!!!!! If you have a compilation error here then you are using old version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if(propertyIndex==0)
        {
            return this.code!=null?this.code:SoapPrimitive.NullNilElement;
        }
        if(propertyIndex==1)
        {
            return this.hint!=null?this.hint:SoapPrimitive.NullNilElement;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 2;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "code";
            info.namespace= "http://localhost/lemoninfo.wsdl";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "hint";
            info.namespace= "http://localhost/lemoninfo.wsdl";
        }
    }
    
    @Override
    public void setProperty(int arg0, Object arg1)
    {
    }

}
