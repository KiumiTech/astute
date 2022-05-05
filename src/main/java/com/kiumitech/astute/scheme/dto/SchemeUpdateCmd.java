package com.kiumitech.astute.scheme.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class SchemeUpdateCmd extends SchemeAddCmd {
    private Long id;
}
