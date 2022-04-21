package com.kiumitech.astute.scheme.dto.data;

import com.kiumitech.astute.basis.DTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class SchemeCO extends DTO {

    private Long id;

    private String name;

    private List<SchemeFieldCO> fields;
}
