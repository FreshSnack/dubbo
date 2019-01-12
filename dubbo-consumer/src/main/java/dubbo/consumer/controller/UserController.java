package dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import dubbo.api.service.UserService;
import dubbo.api.util.JacksonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author dingmx
 * @date 2019/1/12 17:17
 */
@Controller
public class UserController {

    @Reference(url = "dubbo://127.0.0.1:20880")
    UserService userService;

    @ResponseBody
    @RequestMapping("/user")
    public String getUserById(@RequestParam("id") Integer id) {
        return JacksonUtils.toJSon(userService.getUserById(id));
    }
}
