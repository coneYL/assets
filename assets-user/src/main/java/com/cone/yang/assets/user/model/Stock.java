package com.cone.yang.assets.user.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;

/**
 * 股票资产信息
 * @author YangLei
 * @version 1.0.0.1
 * @since 2020/10/9 16:24
 */
@Setter
@Getter
@Entity
@Table(name = "assets_stock")
public class Stock extends AbstractModel{
    /**
     * 所属类型
     */
    @ManyToOne
    private AssetsType assetsType;
    /**
     * 股票号码
     */
    private String code;

    /**
     * 股票名称
     */
    private String name;

    /**
     * 购买单价
     */
    private double unitPrice;

    /**
     * 持有数量
     */
    private double amount;

    /**
     * 购买日期
     */
    private LocalDateTime purchaseDate;

}
