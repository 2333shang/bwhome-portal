package com.bwhome.system.aop;

import cn.hutool.json.JSONUtil;
import com.alibaba.fastjson.JSON;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.Objects;

/**
 * 用环绕通知,打印入参和返回结果,以及接口响应时间
 */
@Aspect
@Component
public class AopAspect {

    private final Logger logger = LoggerFactory.getLogger(AopAspect.class);

    /**
     * 切点
     */
    @Pointcut("execution(* com.bwhome.system.controller.SysUserController.userInfo(..))")
    public void  logPointCut(){
    }



    @Around(value = "logPointCut()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long begin = System.currentTimeMillis();
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest httpServletRequest = Objects.requireNonNull(servletRequestAttributes).getRequest();
        StringBuffer requestURL = httpServletRequest.getRequestURL();
        logger.info("请求路径为："+ requestURL);
        logger.info("请求ip地址为："+ httpServletRequest.getRemoteAddr());
        logger.info("类名为："+ proceedingJoinPoint.getSignature().getDeclaringTypeName());
        logger.info("方法名为：" +  proceedingJoinPoint.getSignature().getName());
        Object args[] = proceedingJoinPoint.getArgs();
        logger.info("请求参数为：" +  JSON.toJSONString(args));
        Object result = proceedingJoinPoint.proceed();
        logger.info("返回结果：" + JSON.toJSONString(result));
        long time = System.currentTimeMillis() - begin;
        logger.info("响应时间：" + time + "ms");
        return result;
    }



}
