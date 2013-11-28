package com.brilliance.eibs.service.api.test;

import com.brilliance.eibs.client.service.EIBSService;
import com.brilliance.eibs.client.service.EIBSServiceCXFFactory;
import com.brilliance.eibs.client.service.EIBSServiceHessianFactory;
import junit.framework.TestCase;

/**
 * 测试 eibs service的客户端.
 * User: jinshunlong
 * Date: 13-11-28
 * Time: 下午7:28
 */
public class EIBSServiceTest extends TestCase {
    private static final String HOST = "http://172.16.4.108:8080/eibs-service";
    private static final String URL_HESSIAN = HOST + "/hessian";
    private static final String URL_CXF = HOST + "/cxf/eibs";
    String jsonParam = "{id:1,data:xxx}";
    String moduleId = "moudleId";
    String rulePath = "serviceRulePath";

    public void testHessian() throws Exception {
        EIBSService eibsService = new EIBSServiceHessianFactory().createService(URL_HESSIAN);
        String re = eibsService.execService(moduleId,rulePath,jsonParam);
        System.out.println(re);
    }

    public void testCXF() throws Exception {
        EIBSService eibsService = new EIBSServiceCXFFactory().createService(URL_CXF);
        String re = eibsService.execService(moduleId,rulePath,jsonParam);
        System.out.println(re);
    }
}
