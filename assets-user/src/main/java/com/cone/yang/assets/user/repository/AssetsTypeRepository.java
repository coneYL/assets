/********************************************
 * 功能说明: User实体类对应的基础业务Repository
 * 模块名称:
 * 系统名称:
 * 软件版权: 西安华信智慧数字科技有限公司
 * 系统版本: 1.0.0.1
 * 开发人员:
 * 开发时间: 2019-12-18 18:41:08
 * 审核人员:
 * 相关文档:
 * 修改记录: 修改日期 修改人员 修改说明
 *********************************************/
package com.cone.yang.assets.user.repository;

import com.cone.yang.assets.user.model.AssetsType;
import com.cone.yang.assets.user.model.User;
import org.springframework.data.repository.Repository;

import java.util.Optional;
import java.util.UUID;

/**
 * 资产类型Repository
 *
 * @author cone.yang
 * @version 1.0.0.1
 * @since 2020-9-30 18:41:08
 */
@org.springframework.stereotype.Repository
public interface AssetsTypeRepository extends Repository<AssetsType, UUID> {

    /**
     * 创建资产类型
     * @param model
     * @return
     */
    AssetsType save(AssetsType model);

    /**
     * 根据用户id资产类型
     * @param id
     * @return
     */
    Optional<AssetsType> findById(UUID id);

    /**
     * 查找使用中的资产类型
     * @return 使用中的资产类型列表
     */
    Iterable<AssetsType> findByInUseIsTrue();

    /**
     * 根据编号获取资产类型
     * @param code
     * @return
     */
    AssetsType findByCode(String code);

}

