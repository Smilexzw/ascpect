package com.jd.ascpect.controller;


import com.jd.ascpect.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * @author xuzhangwang
 * @date 2019/11/8 15:14
 */
@Controller
@Slf4j
public class IndexController {

    @Autowired
    UserService userService;

    @GetMapping("/get/aaa/{username}")
    public String index(@PathVariable("username") String username, Model model) {
        model.addAttribute("username", username);
        return "index";
    }

    /**
     * 将Object对象里面的属性和值转化成Map对象
     *
     * @param obj
     * @return
     * @throws IllegalAccessException
     */
    public Map<String, Object> objectToMap(Object obj)  {
        Map<String, Object> map = new HashMap<String,Object>();
        Class<?> clazz = obj.getClass();
        for (Field field : clazz.getDeclaredFields()) {
            boolean accessible = field.isAccessible();
            field.setAccessible(true);
            String fieldName = field.getName();
            Object o = null;
            try {
                o = field.get(obj);
                if (o != null) {
                    map.put(fieldName, o.toString());
                }
                field.setAccessible(accessible);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return map;
    }

}
