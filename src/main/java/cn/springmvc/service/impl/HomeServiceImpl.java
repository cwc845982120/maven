package cn.springmvc.service.impl;

import cn.springmvc.dao.UserDao;
import cn.springmvc.model.User;
import cn.springmvc.service.HomeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author caowencheng<845982120@qq.com>
 * @create 2017-10-27 23:16
 **/

@Service("homeService")
public class HomeServiceImpl implements HomeService {


    @Resource
    private UserDao userDao;

    public User queryUserById(int id) {

        return this.userDao.queryUserById(id);
    }

}
