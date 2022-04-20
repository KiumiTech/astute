package com.kiumitech.astute.scheme.dto;

import lombok.Data;

import java.util.List;

@Data
public class SchemeAddCmd {

    private String name;

    private List<Field> fields;

    @Data
    public static class Field {
        private String name;
        private String type;
        private String format;
    }

}
