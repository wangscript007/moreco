package io.github.weechang.moreco.rbac.model.dto;

import io.github.weechang.jutil.common.util.BeanUtil;
import io.github.weechang.moreco.rbac.model.domain.Menu;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author zhangwei
 * date 2018/11/30
 * time 13:13
 */
@Data
@ApiModel("部门查询请求")
public class MenuQueryRequest implements Serializable {
    private static final long serialVersionUID = 8496684025572743107L;

    @ApiModelProperty("父菜单ID，一级菜单为0")
    private Long parentId;

    @ApiModelProperty("菜单名称")
    private String name;

    @ApiModelProperty("类型     0：目录   1：菜单   2：按钮")
    private Integer type;

    public Menu toMenu(){
        return BeanUtil.beanToBean(this, Menu.class);
    }
}
