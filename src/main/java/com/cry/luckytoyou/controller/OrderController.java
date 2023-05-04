package com.cry.luckytoyou.controller;

import com.cry.luckytoyou.utils.OrderUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

import java.util.UUID;

/**
 * @author fys
 * @date 2023/5/4
 * @description
 */
@RestController
@RequestMapping("/order")
public class OrderController {


    @GetMapping("/create/result")
    public DeferredResult<Object> createResult() {
        DeferredResult<Object> deferredResult = new DeferredResult<>(5000L, ()->{return "fail";});
        OrderUtils.save(deferredResult);
        return deferredResult;
    }

    @GetMapping("/create")
    public String create(){
        String orderNum = UUID.randomUUID().toString();
        DeferredResult<Object> objectDeferredResult = OrderUtils.get();
        if (objectDeferredResult == null) {
            return "无订单可生成";
        }
        objectDeferredResult.setResult(orderNum);
        return orderNum;
    }
}
