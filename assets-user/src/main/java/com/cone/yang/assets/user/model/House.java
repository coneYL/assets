package com.cone.yang.assets.user.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;

/**
 * 房屋
 * @author YangLei
 * @version 1.0.0.1
 * @since 2020/10/9 16:10
 */
@Setter
@Getter
@Entity
@Table(name = "assets_house")
public class House extends AbstractBaseModel {

    @ManyToOne
    private AssetsType assetsType;

    /**
     * 房屋编号
     */
    private String code;

    /**
     * 小区名称
     */
    private String areaName;
    /**
     *楼栋名称
     */
    private String buildingName;

    /**
     *门牌号
     */
    private String doorName;

    /**
     * 每平米单价
     */
    private double unitPrice;

    /**
     * 面积大小
     */
    private double scale;

    /**
     * 购买日期
     */
    private LocalDateTime purchaseDate;

}
