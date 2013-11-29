package com.brilliance.eibs.flow.activiti;

import org.activiti.engine.*;
import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.Map;


/**
 * 用于在EIBS的Rule中访问Activiti.
 * TODO 需要跟EIBS打通，在EIBS里能找到这个类，可以通过Spring来获取这个类
 * User: jinshunlong
 * Date: 13-11-28
 * Time: 下午8:52
 */
public class EIBSActivitiSupport implements ApplicationContextAware {
    private static final Logger logger = Logger.getLogger(EIBSActivitiSupport.class);
    private static ApplicationContext applicationContext = null;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        EIBSActivitiSupport.applicationContext = applicationContext;
    }

    public ProcessEngine getProcessEngine(){
        return (ProcessEngine) applicationContext.getBean("processEngine");
    }

    public RuntimeService getRuntimeService(){
        return getProcessEngine().getRuntimeService();
    }

    public RepositoryService getRepositoryService(){
        return getProcessEngine().getRepositoryService();
    }

    public TaskService getTaskService(){
        return getProcessEngine().getTaskService();
    }

    public ManagementService getManagementService(){
        return getProcessEngine().getManagementService();
    }

    public IdentityService getIdentityService(){
        return getProcessEngine().getIdentityService();
    }

    public HistoryService getHistoryService(){
        return getProcessEngine().getHistoryService();
    }

    public FormService getFormService(){
        return getProcessEngine().getFormService();
    }
}
