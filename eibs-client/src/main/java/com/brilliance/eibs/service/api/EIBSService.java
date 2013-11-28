package com.brilliance.eibs.service.api;

import javax.jws.WebService;

/**
 * EIBS 对外的Web service统一接口.
 * User: jinshunlong
 * Date: 13-11-9
 * Time: 下午1:56
 */
@WebService
public interface EIBSService {

    /**
     * 统一的调用接口，参数和返回值都是json格式，需要事先定义好
     * @param moduleId 所在module 的标示
     * @param servicePath 要调用的service rule的path
     * @param jsonParams json格式的字符串，最为传入参数，每个webservice都需要定义好自己的接口文档
     * @return json格式的字符串，每个webservice都需要定义好自己的返回值文档
     */
    public String execService(String moduleId,String servicePath,String jsonParams);
}
