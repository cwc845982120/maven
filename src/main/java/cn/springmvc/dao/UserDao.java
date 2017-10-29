package cn.springmvc.dao;

import cn.springmvc.model.User;

/**
 * @author caowencheng
 * @version 1.0.0
 * @description
 * @date 2017-10-29 11:07
 **/

public interface UserDao {

    //根据id查询用户信息
    User queryUserById(int id);

}
