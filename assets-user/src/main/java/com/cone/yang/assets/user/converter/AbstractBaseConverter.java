package com.cone.yang.assets.user.converter;

import com.google.common.collect.Lists;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author YangLei
 * @version 1.0.0.1
 * @since 2020/10/12 11:23
 */
public abstract class AbstractBaseConverter<Model, DTO> {
    /**
     * 传输对象转实体对象
     *
     * @param dto
     * @return
     */
    public abstract Model toModel(DTO dto);

    /**
     * 实体对象转传输对象
     *
     * @param model
     * @return
     */
    public abstract DTO toDTO(Model model);

    /**
     * 实体列表转换为传输对象列表
     * @param models
     * @return
     */
    public List<DTO> toDTOList(List<Model> models) {
        return CollectionUtils.isEmpty(models) ? Lists.newArrayList() : models.stream().map(model -> toDTO(model)).collect(Collectors.toList());
    }


}
