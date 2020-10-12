package com.cone.yang.assets.user.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.lang.Nullable;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 用户管理DTO
 * @author YangLei
 * @version 1.0.0.1
 * @since 2020/10/10 17:09
 */
@Getter
@Setter
@NoArgsConstructor
public class UserDTO implements Serializable {
    private static final long serialVersionUID = -8177975305858198429L;
    /**
     * 用户ID
     */
    @ApiModelProperty(value = "用ID")
    private Long id;
    /**
     * 用户名称
     */
    @ApiModelProperty(value = "用户名称")
    private String name;

}
