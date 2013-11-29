package com.brilliance.eibs.flow.activiti;

import com.brilliance.eibs.client.service.EIBSService;
import com.brilliance.eibs.client.service.EIBSServiceCXFFactory;
import com.brilliance.eibs.client.service.EIBSServiceHessianFactory;
import com.brilliance.eibs.client.service.EIBSServiceHessianProxy;

/**
 * Created with IntelliJ IDEA.
 * User: jinshunlong
 * Date: 13-11-28
 * Time: 下午8:52
 * To change this template use File | Settings | File Templates.
 */
public class EIBSActivitiSupport {
    public static String execHessianService(String hostUrl,String moduleId,String servicePath,String jsonParams){
        EIBSService eibsService = new EIBSServiceHessianFactory().createService(hostUrl);
        return eibsService.execService(moduleId,servicePath,jsonParams);
    }

    public static String execCXFService(String hostUrl,String moduleId,String servicePath,String jsonParams){
        EIBSService eibsService = new EIBSServiceCXFFactory().createService(hostUrl);
        return eibsService.execService(moduleId,servicePath,jsonParams);
    }
}
