package com.kiumitech.astute.scheme.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel
public class SchemeUpdateCmd extends SchemeAddCmd {
    @ApiModelProperty(name = "id", example = "1")
    private Long id;
}
