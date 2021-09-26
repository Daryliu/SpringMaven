package com.ldy.demo;

/**
 * @Author: TianSu
 * @Description:
 * @DateTime: 2021/6/9 20:42
 */
public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        System.out.println("增加了一个用户");
    }

    @Override
    public void delete() {
        System.out.println("删除了一个用户");
    }

    @Override
    public void update() {
        System.out.println("修改了一个用户");
    }

    @Override
    public void query() {
        System.out.println("查询了一个用户");
    }

    //改动原有的代码在公司中是大忌
}
