package com.cry.luckytoyou.service.impl;

import com.cry.luckytoyou.dao.LuckyPersistence;
import com.cry.luckytoyou.entities.Prize;
import com.cry.luckytoyou.service.LuckyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author fys
 * @date 2022/6/19
 * @description
 */
@Service
public class LuckyServiceImpl implements LuckyService {

    private LuckyPersistence luckyPersistence;

    @Autowired
    public void setLuckyPersistence(LuckyPersistence luckyPersistence) {
        this.luckyPersistence = luckyPersistence;
    }

    @Override
    public List<Prize> getList() {
        return luckyPersistence.findAll();
    }

    @Override
    public String addPrize(Prize prize) {
        luckyPersistence.save(prize);
        return "success";
    }
}
