package com.zzg.aop;

import com.sun.istack.internal.logging.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;

/**
 * @author ：zzg
 * @description：
 * @date ：2022/3/1 16:41
 */
@Component
@Aspect
public class MyAop {
    private static Logger log = Logger.getLogger(MyAop.class);
    private long start = 0;

    @Pointcut("execution(* com.zzg.controller.*.*(..))")
    public void aa() {

    }

    @Before("aa()")
    public void begin(JoinPoint point) {
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();
        HttpServletResponse response = requestAttributes.getResponse();

        String addr = request.getRemoteAddr();
        String uri = request.getRequestURI();
        Object[] args = point.getArgs();
        start = System.currentTimeMillis();
        log.info("===================请求的地址是:=================" + addr);
        log.info("===================请求的路径是:=================" + uri);
        log.info("===================请求的参数是:=================" + Arrays.toString(args));
    }

    @After("aa()")
    public void end() {
        long end = System.currentTimeMillis();
        log.info("=================耗时=================" + (end - start));
        log.info("=================结束了=================");
    }
}
