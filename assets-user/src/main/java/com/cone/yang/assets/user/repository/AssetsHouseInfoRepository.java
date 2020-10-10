package com.cone.yang.assets.user.repository;

import com.cone.yang.assets.user.model.AssetsHouseInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * 房屋资产信息表
 * @author yanglei
 */
@Repository
public interface AssetsHouseInfoRepository extends CrudRepository<AssetsHouseInfo, UUID> {
}
