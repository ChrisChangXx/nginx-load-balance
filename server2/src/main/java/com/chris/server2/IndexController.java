package com.chris.server2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class IndexController {

    @RequestMapping("/getUser")
    public Object getUser() {
        Map<String, String> res = new HashMap<>();
        res.put("user", "server2");
        return res;
    }
}
