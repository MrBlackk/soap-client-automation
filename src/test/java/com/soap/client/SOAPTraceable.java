package com.soap.client;

import com.soap.utils.SOAPClient;
import com.soap.ws.HelloWorld;

/**
 * Created by Mr.Black on 21.12.2014.
 */
public class SOAPTraceable {

    public static void main(String[] args) {
        HelloWorld soapClient = new SOAPClient().client;

        System.out.println(soapClient.getHelloWorldAsString("Hello"));
    }
}
