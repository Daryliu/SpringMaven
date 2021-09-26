package com.ldy.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @Copyright(c)2019-2021,Smart3dMap.Co.ltd
 * @Author TianSu (1201920637@cug.edu.cn)
 * @Classname AfterLog
 * @Description
 * @DateTime 2021/9/26 20:47
 */
public class AfterLog implements AfterReturningAdvice {
    @Override
    //returnValue 返回值
    public void afterReturning(Object returnValue, Method method, Object[] objects, Object target) throws Throwable {
        System.out.println("后置日志："+"执行了"+method.getName()+"方法，返回结果为"+returnValue);
    }
}
