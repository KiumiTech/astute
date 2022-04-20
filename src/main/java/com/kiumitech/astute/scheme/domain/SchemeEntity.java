package com.kiumitech.astute.scheme.domain;

import com.kiumitech.astute.basis.BusinessObject;
import lombok.Data;
import lombok.Getter;

import java.util.List;

public class SchemeEntity extends BusinessObject<Long> {

    @Getter
    private Long id;
    @Getter
    private String name;
    @Getter
    private List<Field> fields;


    @Data
    public static class Field {
        private String name;
        private FieldType type;
        private String format;
    }

    public enum FieldType {
        INT,
        LONG,
        FLOAT,
        DOUBLE,
        STRING,
        DATE,
        BOOLEAN,
        REFERENCE
    }

    public static Field newField(String name, FieldType fieldType) {
        return newField(name, fieldType, null);
    }

    public static Field newField(String name, FieldType fieldType, String format) {
        Field field = new Field();
        field.setName(name);
        field.setType(fieldType);
        field.setFormat(format);
        return field;
    }
}
