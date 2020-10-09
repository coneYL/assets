package com.cone.yang.assets.user.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.Persistable;
import org.springframework.lang.Nullable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 资产类型
 * @author yanglei
 */
@Getter
@Setter
@Entity
@Table(name ="assets_type")
public class AssetsType extends AbstractModel {
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
