package com.cry.luckytoyou.service;

import com.cry.luckytoyou.entities.Prize;

import java.util.List;

/**
 * @author fys
 * @date 2022/6/19
 * @description
 */
public interface LuckyService {
    List<Prize> getList();

    String addPrize(Prize prize);
}
