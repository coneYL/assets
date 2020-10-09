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

import com.cone.yang.assets.user.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.data.repository.Repository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * User实体类对应的基础业务Repository
 *
 * @author cone.yang
 * @version 1.0.0.1
 * @since 2020-9-30 18:41:08
 */
@org.springframework.stereotype.Repository
public interface UserRepository extends Repository<User, UUID> {

    /**
     * 创建用户
     * @param model
     * @return
     */
    User save(User model);

    /**
     * 根据用户id查找用户
     * @param id
     * @return
     */
    Optional<User> findById(UUID id);


    /**
     * 根据用户id删除用户
     * @param id
     */
    void deleteById(UUID id);


}

