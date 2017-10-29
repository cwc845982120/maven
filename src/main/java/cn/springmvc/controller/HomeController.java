package cn.springmvc.controller;

import cn.springmvc.base.BaseController;
import cn.springmvc.model.User;
import cn.springmvc.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;


/**
 * @author caowencheng<845982120@qq.com>
 * @create 2017-10-26 22:44
 **/

@Controller
@RequestMapping("/home")
public class HomeController extends BaseController {

    private HomeService homeService;

    @Autowired
    public void setHomeService(HomeService homeService) {

        this.homeService = homeService;

    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String checkSuccess(){

        logger.debug("server work success!");

        return "index";

    }

    @RequestMapping(value = "/json", method = RequestMethod.POST)
    public @ResponseBody User getDataJson(HttpServletRequest request){

        int id = Integer.parseInt(request.getParameter("id"));

        logger.debug("the id = {}", id);

        return homeService.queryUserById(id);

    }

}
