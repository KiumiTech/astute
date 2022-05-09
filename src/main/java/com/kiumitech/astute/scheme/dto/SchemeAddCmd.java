package com.kiumitech.astute.scheme.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
@ApiModel
public class SchemeAddCmd {

    @ApiModelProperty
    private String name;
    @ApiModelProperty
    private String notes;
    @ApiModelProperty
    private String property;
    @ApiModelProperty
    private List<Field> fields;

    @Data
    @ApiModel
    public static class Field {
        @ApiModelProperty
        private String name;
        @ApiModelProperty(allowableValues = "INT,LONG,FLOAT,DOUBLE,STRING,DATE,BOOLEAN,REFERENCE")
        private String type;
        @ApiModelProperty
        private String format;
        @ApiModelProperty
        private String notes;
    }

}
