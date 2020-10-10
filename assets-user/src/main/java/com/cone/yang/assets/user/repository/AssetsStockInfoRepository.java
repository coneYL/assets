package com.cone.yang.assets.user.repository;

import com.cone.yang.assets.user.model.AssetsStockInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * 股票资产信息表
 * @author yanglei
 */@Repository

public interface AssetsStockInfoRepository extends CrudRepository<AssetsStockInfo, UUID> {
}
