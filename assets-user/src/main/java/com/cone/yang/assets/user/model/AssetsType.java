package com.cone.yang.assets.user.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 资产类型
 * @author yanglei
 */
@Getter
@Setter
@Entity
@Table(name ="assets_type")
public class AssetsType extends AbstractBaseModel {

    /**
     * 编码
     */
    private String code;
    /**
     * 名称
     */
    private String name;

    /**
     * 是否使用
     */
    private boolean inUse;
}
