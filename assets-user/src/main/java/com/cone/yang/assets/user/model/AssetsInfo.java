package com.cone.yang.assets.user.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 资产信息
 * @author YangLei
 * @version 1.0.0.1
 * @since 2020/10/9 16:03
 */
@Setter
@Getter
@Entity
@Table(name = "assets_info")
public class AssetsInfo extends AbstractModel{
    /**
     * 资产id
     */
    private Long assetsId;

    /**
     * 资产市值
     */
    private double assetValue;

}
