package com.crcb.aop;

import com.alibaba.fastjson.JSONObject;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 *
 * @ClassName: LogAspect
 * @Description: 日志记录AOP实现
 * @date 2014年11月3日 下午1:51:59
 *
 */
@Aspect
public class LogAspect {


    @Pointcut("execution(public * com.crcb.controller..insert*(..))")
    private void insert(){}

    @Pointcut("execution(public * com.crcb.controller..update*(..))")
    private void update(){}

    @Pointcut("execution(public * com.crcb.controller..delete*(..))")
    private void delete(){}

    //定义环绕通知：处理日志注入
    @Around("insert()||update()||delete()")
    private Object logAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object[] args = proceedingJoinPoint.getArgs();
        System.out.println("===============请求内容===============");
        String requestStr = JSONObject.toJSONString(args);
        System.out.println("请求类方法:"+proceedingJoinPoint.getSignature().toString());
        System.out.println("请求参数：user,"+requestStr);
        System.out.println("请求CLASS_METHOD:"+proceedingJoinPoint.getTarget().getClass().getName());
        System.out.println("===============请求内容===============");
        System.out.println("--------------返回内容----------------");
        Object result = proceedingJoinPoint.proceed();
        System.out.println("Response内容:" + JSONObject.toJSONString(result));
        System.out.println("--------------返回内容----------------");
        return result;
    }
}