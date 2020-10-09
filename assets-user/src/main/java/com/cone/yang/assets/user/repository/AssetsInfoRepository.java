package com.cone.yang.assets.user.repository;

import com.cone.yang.assets.user.model.AssetsInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * 资产信息表
 * @author yanglei
 */
@Repository
public interface AssetsInfoRepository extends CrudRepository<AssetsInfo, UUID> {
}
