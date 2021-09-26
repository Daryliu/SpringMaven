package com.ldy.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @Copyright(c)2019-2021,Smart3dMap.Co.ltd
 * @Author TianSu (1201920637@cug.edu.cn)
 * @Classname Log
 * @Description
 * @DateTime 2021/9/26 20:42
 */
public class Log implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        /**
         * @param method 要执行的目标对象的方法
         * @param: objects 参数
         * @param: o 目标对象
         * @return void
         */
        System.out.println("前置日志"+o.getClass().getName()+"的"+method.getName());
    }
}
