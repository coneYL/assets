package com.cone.yang.assets.user.repository;

import com.cone.yang.assets.user.model.UserAssetsStockInfoAssociation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * 用户股票资产
 * @author yanglei
 */
@Repository
public interface UserAssetsStockInfoAssociationRepository extends CrudRepository<UserAssetsStockInfoAssociation, UUID> {
}
