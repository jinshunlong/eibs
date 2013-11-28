package com.brilliance.eibs.service.api.impl;

import com.brilliance.eibs.service.api.EIBSService;

import javax.jws.WebService;

/**
 * EIBS服务的实现类.
 * User: jinshunlong
 * Date: 13-11-9
 * Time: 下午1:59
 */
@WebService()
public class EIBSServiceImpl implements EIBSService{
    @Override
    public String execService(String moduleId, String servicePath, String jsonParams) {
        //TODO 具体访问EIBS web service的逻辑代码
        return jsonParams;//这里只是为了测试
    }
}
