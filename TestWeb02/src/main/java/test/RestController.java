package test;

import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

/**
 * Created by hb on 2016/12/25.
 */
@org.springframework.web.bind.annotation.RestController
public class RestController {

    @RequestMapping("/rest")
    public String rest() {
        List<Map<String, String>> list = new ArrayList<Map<String, String>>();

        for (int i = 0; i < 10; i++) {
            Map<String, String> map = new HashMap<String, String>();
            map.put(new Random().nextInt(100) + "key", new Random().nextInt(200) + "");
            list.add(map);
        }

        System.out.print(JSON.toJSONString(list));
        // List<String> list = new ArrayList<String>();

        return JSON.toJSONString(list);
    }
}
