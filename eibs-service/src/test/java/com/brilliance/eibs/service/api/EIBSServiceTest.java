package com.brilliance.eibs.service.api;

import com.brilliance.eibs.client.service.EIBSService;
import com.caucho.hessian.client.HessianProxyFactory;
import junit.framework.TestCase;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

/**
 * EIBS service测试类.
 * User: jinshunlong
 * Date: 13-11-9
 * Time: 下午3:40
 */
public class EIBSServiceTest extends TestCase {
    private static final String HOST = "http://172.16.4.108:8080/eibs-service";
    private static final String URL_HESSIAN = HOST + "/hessian";
    private static final String URL_CXF = HOST + "/cxf/eibs";
    /**
     * 测试execService方法，测试hessian发布的方式
     * @throws Exception
     */
    public void testExecServiceByHessian() throws Exception {
        HessianProxyFactory factory = new HessianProxyFactory();
        try{
            EIBSService eibsService = (EIBSService) factory.create(EIBSService.class,URL_HESSIAN);
            String jsonParam = "{id:1,data:xxx}";
            String re = eibsService.execService("moudleId","serviceRulePath",jsonParam);
            System.out.println("return=" + re);
            assertEquals(re, jsonParam);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * 测试execService方法，测试cxf发布的方式
     * @throws Exception
     */
    public void testExecServiceByWebService() throws Exception {
        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
        factoryBean.setServiceClass(EIBSService.class);
        factoryBean.setAddress(URL_CXF);
        try{
            EIBSService eibsService = (EIBSService)factoryBean.create();
            String jsonParam = "{id:1,data:xxx}";
            String re = eibsService.execService("moudleId","serviceRulePath",jsonParam);
            System.out.println("return=" + re);
            assertEquals(re, jsonParam);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
