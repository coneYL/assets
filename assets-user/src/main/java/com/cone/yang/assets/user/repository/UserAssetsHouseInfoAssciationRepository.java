package com.cone.yang.assets.user.repository;

import com.cone.yang.assets.user.model.UserAssetsHouseInfoAssciation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * 用户房产资产
 * @author yanglei
 */
@Repository
public interface UserAssetsHouseInfoAssciationRepository extends CrudRepository<UserAssetsHouseInfoAssciation, UUID> {
}
