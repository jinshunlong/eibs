package com.brilliance.eibs.service.api;

/**
 * eibs service的proxy调用代理.
 * User: jinshunlong
 * Date: 13-11-28
 * Time: 下午7:07
 */
public abstract class EIBSServiceProxy implements EIBSService{

    protected String hostUrl;
    protected EIBSService eibsService;

    public EIBSServiceProxy(String hostUrl){
        this.hostUrl = hostUrl;
    }
    protected abstract EIBSService getEibsService();
    @Override
    public String execService(String moduleId, String servicePath, String jsonParams) {
        eibsService = getEibsService();
        if(eibsService != null){
            return eibsService.execService(moduleId,servicePath,jsonParams);
        }
        return null;
    }
}
