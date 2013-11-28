package com.brilliance.eibs.service.api;

import com.caucho.hessian.client.HessianProxyFactory;
import org.apache.log4j.Logger;

import java.net.MalformedURLException;

/**
 * Hessian访问代理.
 * User: jinshunlong
 * Date: 13-11-28
 * Time: 下午7:41
 */
public class EIBSServiceHessianProxy extends EIBSServiceProxy{
    private static final Logger logger = Logger.getLogger(EIBSServiceHessianProxy.class);

    private HessianProxyFactory factory = new HessianProxyFactory();

    public EIBSServiceHessianProxy(String hostUrl) {
        super(hostUrl);
        getEibsService();
    }
    protected EIBSService getEibsService(){
        if(eibsService == null){
            try {
                eibsService = (EIBSService) factory.create(EIBSService.class,hostUrl);
            } catch (MalformedURLException e) {
                logger.error(e.getMessage(),e);
            }
        }
        return eibsService;
    }

}
