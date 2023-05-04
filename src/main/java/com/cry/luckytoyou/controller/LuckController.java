package com.cry.luckytoyou.controller;

import com.cry.luckytoyou.entities.Prize;
import com.cry.luckytoyou.service.LuckyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author fys
 * @date 2022/6/18
 * @description
 */
@RestController
@RequestMapping("/luck")
public class LuckController {

    private LuckyService luckyService;

    @Autowired
    public void setLuckyService(LuckyService luckyService) {
        this.luckyService = luckyService;
    }

    @RequestMapping("/index")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("lottery");
        return modelAndView;
    }

    @GetMapping("/get")
    public List<Prize> get(){
        return luckyService.getList();
    }

    @PostMapping("/add")
    public String add(@RequestBody Prize prize){
        if (prize.getPrizeName() == null || "".equals(prize.getPrizeName())) {
            return null;
        }
        if (prize.getPrizePic() == null || "".equals(prize.getPrizePic())) {
            return null;
        }
        return luckyService.addPrize(prize);
    }
}
