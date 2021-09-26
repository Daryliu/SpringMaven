package com.ldy.proxy;

/**
 * @Author: TianSu
 * @Description:房东
 * @DateTime: 2021/6/9 20:11
 */
public class Host implements Rent{

    @Override
    public void rent() {
        System.out.println("房东要出租房子");//房东是只租房子。其他多余的事情都不做，都是中介做
    }
}
