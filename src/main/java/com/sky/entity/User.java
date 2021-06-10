package com.sky.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    //在swagger-ui.html#页面中如果返回User，ModelModel Schema选项卡可见，包括如入参和出参
    @ApiModelProperty(value = "用户的姓名，比如'李四'")
    private String name;
    @ApiModelProperty(value = "id",required = true)
    private String id;
    @ApiModelProperty(value = "用户的年龄，比如：20")
    private Integer age;

}
