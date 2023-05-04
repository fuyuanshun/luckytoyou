package com.cry.luckytoyou.dao;

import com.cry.luckytoyou.entities.Prize;
import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * @author fys
 * @date 2022/6/19
 * @description
 */
public interface LuckyPersistence extends Repository<Prize, Integer> {
    List<Prize> findAll();

    void save(Prize prize);
}
