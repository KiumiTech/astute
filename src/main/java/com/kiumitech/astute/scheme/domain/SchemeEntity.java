package com.kiumitech.astute.scheme.domain;

import com.kiumitech.astute.basis.BusinessObject;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class SchemeEntity extends BusinessObject<Long> {

    @Getter
    @Setter
    private Long id;
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private List<Field> fields;
    @Getter
    @Setter
    private String notes;
    @Getter
    @Setter
    private String property;


    @Data
    public static class Field {
        private String name;
        private FieldType type;
        private String format;
        private String notes;
        private String property;
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
