package com.ldy.proxy;

/**
 * @Author: TianSu
 * @Description:客户
 * @DateTime: 2021/6/9 20:13
 */
public class Client {
    public static void main(String[] args) {

        Host host = new Host();//之前是直接找房东租房子
        //代理---客户找代理租房子，代理需要拿到房东的房子出租权（而且中介会有附加的操作）
        rentProxy proxy = new rentProxy(host);
        proxy.rent();

    }
}
