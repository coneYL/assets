package com.cone.yang.assets.user.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.Nullable;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

/**
 * @author YangLei
 * @version 1.0.0.1
 * @since 2020/9/30 16:37
 */
@Getter
@Setter
@Entity
@Table(name = "assets_user")
public class User extends AbstractBaseModel {

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

}
