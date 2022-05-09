package com.kiumitech.astute.scheme.dto.data;

import com.kiumitech.astute.basis.DTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@ApiModel
@Data
@EqualsAndHashCode(callSuper = true)
public class SchemeCO extends DTO {

    @ApiModelProperty(example = "1")
    private Long id;
    @ApiModelProperty(example = "name")
    private String name;
    @ApiModelProperty
    private String property;
    @ApiModelProperty
    private String notes;
    @ApiModelProperty
    private List<SchemeFieldCO> fields;
}
