package com.cone.yang.assets.user.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.Persistable;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author YangLei
 * @version 1.0.0.1
 * @since 2020/9/30 16:37
 */
@Getter
@Setter
@Entity
@Component
@Table(name = "assets_user")
public class User implements Persistable<Long>, Serializable {

    /**
     * 用户id
     */
    @Nullable
    @GeneratedValue
    @Id
    private Long id;

    /**
     * 用户名称
     */
    @NotBlank
    private String name;

    /**
     * 注册时间
     */
    @Nullable
    private LocalDateTime registerDate;

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public boolean isNew() {
        return StringUtils.isEmpty(this.id);
    }
}
