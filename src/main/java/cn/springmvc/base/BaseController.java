package cn.springmvc.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import cn.springmvc.util.JsonUtils;

import java.util.Map;

/**
 * @author caowencheng<845982120@qq.com>
 * @create 2017-10-29 10:33
 **/

@Controller
public class BaseController {

    public static final Logger logger = LoggerFactory.getLogger("API");

    public static Map<String,Object> json2Map (String json){

        return JsonUtils.json2Map(json);

    }

}
