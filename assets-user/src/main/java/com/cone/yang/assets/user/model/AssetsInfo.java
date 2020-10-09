package com.cone.yang.assets.user.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.time.LocalDateTime;

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
    @Column(name = "asserts_id")
    private Long assertsId;

    /**
     * 资产市值
     */
    private double assetValue;

    /**
     * 资产成本
     */
    private double assetCost;

    /**
     * 市场单价
     */
    private double currentPrice;

    /**
     * 计算时间
     */
    @Nullable
    private LocalDateTime priceDate;

}
