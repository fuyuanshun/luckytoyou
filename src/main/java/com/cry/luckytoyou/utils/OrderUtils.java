package com.cry.luckytoyou.utils;

import org.springframework.web.context.request.async.DeferredResult;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @author fys
 * @date 2023/5/4
 * @description
 */
public class OrderUtils {
    private static final Queue<DeferredResult<Object>> QUEUE = new ConcurrentLinkedQueue<>();

    public static void save(DeferredResult<Object> deferredResult){
        QUEUE.add(deferredResult);
    }

    public static DeferredResult<Object> get() {
        return QUEUE.poll();
    }
}
