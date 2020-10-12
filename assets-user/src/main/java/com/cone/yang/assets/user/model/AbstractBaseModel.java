package com.cone.yang.assets.user.model;

import org.springframework.data.domain.Persistable;
import org.springframework.lang.Nullable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * @author YangLei
 * @version 1.0.0.1
 * @since 2020/10/9 15:28
 */
@MappedSuperclass
public class AbstractBaseModel implements Persistable<Long>, Serializable {
    /**
     * 用户id
     */
    @Nullable
    @GeneratedValue
    @Id
    private Long id;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public boolean isNew() {
        return false;
    }
}
