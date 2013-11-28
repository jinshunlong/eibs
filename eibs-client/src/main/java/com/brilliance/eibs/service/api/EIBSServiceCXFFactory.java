package com.brilliance.eibs.service.api;

/**
 * Created with IntelliJ IDEA.
 * User: jinshunlong
 * Date: 13-11-28
 * Time: 下午7:40
 * To change this template use File | Settings | File Templates.
 */
public class EIBSServiceCXFFactory extends EIBSServiceFactory{
    @Override
    protected EIBSServiceProxy createProxy(String hostUrl) {
        return new EIBSServiceCXFProxy(hostUrl);  //To change body of implemented methods use File | Settings | File Templates.
    }
}
