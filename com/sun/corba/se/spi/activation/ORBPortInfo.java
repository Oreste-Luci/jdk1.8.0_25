package com.sun.corba.se.spi.activation;


/**
* com/sun/corba/se/spi/activation/ORBPortInfo.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /HUDSON3/workspace/8-2-build-macosx-x86_64/jdk8u25/1514/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Wednesday, September 17, 2014 4:58:15 PM PDT
*/

public final class ORBPortInfo implements org.omg.CORBA.portable.IDLEntity
{
  public String orbId = null;
  public int port = (int)0;

  public ORBPortInfo ()
  {
  } // ctor

  public ORBPortInfo (String _orbId, int _port)
  {
    orbId = _orbId;
    port = _port;
  } // ctor

} // class ORBPortInfo
