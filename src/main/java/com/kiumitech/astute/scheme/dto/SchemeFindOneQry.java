package com.kiumitech.astute.scheme.dto;

import com.kiumitech.astute.basis.DTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel
public class SchemeFindOneQry extends DTO {

    @ApiModelProperty(name = "id", example = "1")
    private Long id;

}
