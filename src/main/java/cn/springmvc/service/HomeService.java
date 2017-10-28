package cn.springmvc.service;

import cn.springmvc.model.PageData;
/**
 * @author caowencheng<845982120@qq.com>
 * @create 2017-10-27 22:28
 **/

public interface HomeService {

    PageData getUserById(int id);

    PageData queryUserById(int id);

}
