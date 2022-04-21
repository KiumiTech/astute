package com.kiumitech.astute.scheme.domain;

import com.kiumitech.astute.scheme.domain.SchemeEntity.FieldType;

import com.kiumitech.astute.scheme.domain.SchemeEntity.Field;

import java.util.ArrayList;

import com.kiumitech.astute.scheme.persistence.Scheme;
import com.kiumitech.astute.scheme.persistence.SchemeField;

import java.util.List;
import java.util.stream.Collectors;

public class SchemeConverter {
    public static SchemeEntity of(Scheme scheme, List<SchemeField> fields) {
        SchemeEntity entity = new SchemeEntity();
        entity.setId(scheme.getId());
        entity.setName(scheme.getName());

        entity.setNotes(scheme.getNotes());
        entity.setProperty(scheme.getProperty());

        if (fields == null || fields.isEmpty())
            entity.setFields(new ArrayList<>());
        else
            entity.setFields(fields.stream().map(p -> {
                SchemeEntity.Field field = new Field();
                field.setName(p.getName());
                field.setType(FieldType.valueOf(p.getType()));
                field.setFormat(p.getFormat());
                return field;
            }).collect(Collectors.toList()));
        return entity;
    }
}
