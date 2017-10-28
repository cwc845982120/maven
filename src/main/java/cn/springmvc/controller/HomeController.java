package cn.springmvc.controller;

import cn.springmvc.model.PageData;
import cn.springmvc.service.HomeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


/**
 * @author caowencheng<845982120@qq.com>
 * @create 2017-10-26 22:44
 **/

@Controller
@RequestMapping("/home")
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    private HomeService homeService;

    @Autowired
    public void setHomeService(HomeService homeService) {

        this.homeService = homeService;

    }


    @RequestMapping(value = "/index/{title}", method = RequestMethod.GET)
    public String index(@PathVariable("title") String title, Model model){

        logger.info("The title = {}", title);

        PageData pageData = homeService.getStringByTitle(title);

        model.addAttribute(pageData);

        //返回一个index.jsp这个视图
        return "index";
    }

    @RequestMapping(value = "/json", method = RequestMethod.GET)
    public @ResponseBody PageData getDataJson(){

        return homeService.getJson();

    }

}
