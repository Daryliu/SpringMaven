package com.ldy.service;

/**
 * @Copyright(c)2019-2021,Smart3dMap.Co.ltd
 * @Author TianSu (1201920637@cug.edu.cn)
 * @Classname UserServiceImpl
 * @Description
 * @DateTime 2021/9/26 20:38
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
        System.out.println("修改一个用户");
    }

    @Override
    public void query() {
        System.out.println("查询一个用户");
    }
}
