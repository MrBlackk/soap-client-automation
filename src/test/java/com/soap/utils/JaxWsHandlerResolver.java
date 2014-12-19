package com.soap.utils;

import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mr.Black on 19.12.2014.
 */
//set up and trace
public class JaxWsHandlerResolver implements HandlerResolver {
    @Override
    public List<Handler> getHandlerChain(PortInfo portInfo) {
        List<Handler> chain = new ArrayList<Handler>();
        chain.add(new SoapClientHandlerLog());
        return chain;
    }
}
