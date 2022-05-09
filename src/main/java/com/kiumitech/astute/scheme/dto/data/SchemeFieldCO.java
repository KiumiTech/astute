package com.kiumitech.astute.scheme.dto.data;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel
public class SchemeFieldCO {

    @ApiModelProperty
    private String format;
    @ApiModelProperty
    private String property;
    @ApiModelProperty
    private String name;
    @ApiModelProperty
    private String type;
    @ApiModelProperty
    private String notes;
}
