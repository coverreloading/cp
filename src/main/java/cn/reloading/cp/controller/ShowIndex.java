package cn.reloading.cp.controller;

import cn.reloading.cp.mapper.CpItemsMapper;
import cn.reloading.cp.po.CpItems;
import cn.reloading.cp.service.CpItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by loadi on 2017/9/5.
 */
@Controller
public class ShowIndex {

    @Autowired
    CpItemsService cpItemsService;

    @RequestMapping("/index")
    public String showindex(){
        return "showindex";
    }
    @RequestMapping("/test")
    @ResponseBody
    public int test() {
        CpItems items = new CpItems();
        items.setName("123");
        items.setPic("sdf");
        items.setContent("123");
        items.setCatid(123);
        items.setCreatetime((int) System.currentTimeMillis());
        items.setUpdatetime((int) System.currentTimeMillis());
        return cpItemsService.insert(items);
    }

    @RequestMapping("/test2")
    @ResponseBody
    public String test2() {
        return "llllll";
    }
}
