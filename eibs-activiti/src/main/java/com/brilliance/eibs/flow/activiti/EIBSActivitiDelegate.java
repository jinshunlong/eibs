package com.brilliance.eibs.flow.activiti;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;
import org.apache.log4j.Logger;

import java.util.Map;

/**
 * 用于在activiti的JavaTask中访问.
 * TODO 需要跟EIBS在这里打通,让activiti能找到EIBS
 * User: jinshunlong
 * Date: 13-11-29
 * Time: 上午10:55
 */
public class EIBSActivitiDelegate implements JavaDelegate {
    private static final Logger logger = Logger.getLogger(EIBSActivitiDelegate.class);

    /**
     *
     * @param delegateExecution
     * @throws Exception
     */
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {

        //变量信息
        Map<String,Object> variables = delegateExecution.getVariables();//flow中的变量，可以传递到其他节点
        Map<String,Object> variablesLocal = delegateExecution.getVariablesLocal();//本地变量，只能在本节点使用

        //基础的信息，等等
        String activityId = delegateExecution.getCurrentActivityId();//当前节点的ID
        String processInstanceId = delegateExecution.getProcessInstanceId();//当前流程的ID

        logger.info(String.format("variables=%s\nvariablesLocal=%s\ngetCurrentActivityId=%s\ngetProcessInstanceId=%s",variables.toString(),variablesLocal.toString(),activityId,processInstanceId));

        //TODO 将flow中的变量传递给eibs,进行调用，比如调用哪个module的哪个rule,可以约定variable 名字

        //这里只是个演示
        delegateExecution.setVariable("mytext","eibs invoke成功！！！！");
    }
}
