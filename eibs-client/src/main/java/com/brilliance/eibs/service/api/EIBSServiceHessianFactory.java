package com.brilliance.eibs.service.api;

/**
 * Created with IntelliJ IDEA.
 * User: jinshunlong
 * Date: 13-11-28
 * Time: 下午7:39
 * To change this template use File | Settings | File Templates.
 */
public class EIBSServiceHessianFactory extends EIBSServiceFactory {

    @Override
    protected EIBSServiceProxy createProxy(String hostUrl) {
        return new EIBSServiceHessianProxy(hostUrl);  //To change body of implemented methods use File | Settings | File Templates.
    }
}
