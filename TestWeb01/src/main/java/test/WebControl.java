package test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hb on 2016/12/24.
 */
@Controller
public class WebControl {

    @RequestMapping("/index")
    public String index(){
        return "test";
    }
}
