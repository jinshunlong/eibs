package com.brilliance.eibs.client.service;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.log4j.Logger;

/**
 * Created with IntelliJ IDEA.
 * User: jinshunlong
 * Date: 13-11-28
 * Time: 下午7:42
 * To change this template use File | Settings | File Templates.
 */
public class EIBSServiceCXFProxy extends EIBSServiceProxy {
    private static Logger logger = Logger.getLogger(EIBSServiceCXFProxy.class);
    private JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();

    public EIBSServiceCXFProxy(String hostUrl) {
        super(hostUrl);
        factoryBean.setServiceClass(EIBSService.class);
        factoryBean.setAddress(hostUrl);
    }

    protected EIBSService getEibsService(){
        if(eibsService == null){
            try {
                eibsService = (EIBSService)factoryBean.create();
            } catch (Exception e) {
                logger.error(e.getMessage(),e);
            }
        }
        return eibsService;
    }
}
