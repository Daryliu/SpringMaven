package com.ldy.demo;

/**
 * @Author: TianSu
 * @Description:
 * @DateTime: 2021/6/9 20:43
 */
public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        UserServiceProxy Proxy = new UserServiceProxy();
        Proxy.setUserService(userService);

        Proxy.delete();
    }
}
