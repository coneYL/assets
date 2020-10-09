package com.cone.yang.assets.user.repository;

import com.cone.yang.assets.user.model.House;
import com.cone.yang.assets.user.model.Stock;
import org.springframework.data.repository.Repository;

import java.util.Optional;
import java.util.UUID;

@org.springframework.stereotype.Repository
public interface StockRepository extends Repository<Stock, UUID> {
    /**
     * 添加股票信息
     * @param model
     * @return
     */
    Stock save(Stock model);

    /**
     * 根据用户id查找股票信息
     * @param id
     * @return
     */
    Optional<Stock> findById(UUID id);


    /**
     * 根据用户id删除股票信息
     * @param id
     */
    void deleteById(UUID id);
}
