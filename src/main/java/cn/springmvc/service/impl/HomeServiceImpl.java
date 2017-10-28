package cn.springmvc.service.impl;

import cn.springmvc.model.PageData;
import cn.springmvc.service.HomeService;
import org.springframework.stereotype.Service;

/**
 * @author caowencheng<845982120@qq.com>
 * @create 2017-10-27 23:16
 **/

@Service("homeService")
public class HomeServiceImpl implements HomeService {

    public PageData getUserById(int id) {

        PageData pageData = new PageData();

        return pageData;

    }

    public PageData queryUserById(int id) {

        PageData pageData = new PageData();

        return pageData;

    }

}
