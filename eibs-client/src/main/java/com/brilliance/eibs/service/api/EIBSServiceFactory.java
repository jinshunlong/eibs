package com.brilliance.eibs.service.api;

/**
 * 调用eibs service的客户端.
 * //TODO 支持Spring BeanFactory，跟Spring整合
 * User: jinshunlong
 * Date: 13-11-28
 * Time: 下午7:02
 */
public abstract class EIBSServiceFactory {
    private static EIBSServiceProxy serviceProxy;

    /**
     * 创建服务Proxy
     * @param hostUrl
     * @return
     */
    public EIBSService createService(String hostUrl){
        if(serviceProxy == null){
            serviceProxy = createProxy(hostUrl);
        }
        return serviceProxy;
    }

    protected abstract EIBSServiceProxy createProxy(String hostUrl);

}
