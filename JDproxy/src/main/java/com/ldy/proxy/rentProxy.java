package com.ldy.proxy;

/**
 * @Author: TianSu
 * @Description:中介代理
 * @DateTime: 2021/6/9 20:16
 */
public class rentProxy implements Rent{

    private Host host;

    public rentProxy(){

    }

    public rentProxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        seeHouse();
        host.rent();    //帮房东租房子
        hetong();
        fare();
    }


    //看房
    public void seeHouse() {
        System.out.println("中介带你看房");
    }

    //收中介费
    public void fare() {
        System.out.println("收中介费");
    }

    //签合同
    public void hetong() {
        System.out.println("签租赁合同");
    }

}
