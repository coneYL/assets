package com.cone.yang.assets.user.repository;

import com.cone.yang.assets.user.model.House;
import com.cone.yang.assets.user.model.User;
import org.springframework.data.repository.Repository;

import java.util.Optional;
import java.util.UUID;

/**
 * @author YangLei
 * @version 1.0.0.1
 * @since 2020/10/9 16:32
 */
@org.springframework.stereotype.Repository
public interface HouseRepository extends Repository<House, UUID> {
    /**
     * 添加房产信息
     * @param model
     * @return
     */
    House save(House model);

    /**
     * 根据用户id查找房产信息
     * @param id
     * @return
     */
    Optional<House> findById(UUID id);


    /**
     * 根据用户id删除房产信息
     * @param id
     */
    void deleteById(UUID id);
}
