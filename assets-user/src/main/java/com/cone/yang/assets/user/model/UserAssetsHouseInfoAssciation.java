package com.cone.yang.assets.user.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * 用户房产资产关系表
 * @author YangLei
 * @version 1.0.0.1
 * @since 2020/10/10 10:55
 */
@Setter
@Getter
@Entity
@Table(name = "user_assets_house_info_association")
public class UserAssetsHouseInfoAssciation extends AbstractBaseModel {
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private AssetsHouseInfo assetsHouseInfo;
}
