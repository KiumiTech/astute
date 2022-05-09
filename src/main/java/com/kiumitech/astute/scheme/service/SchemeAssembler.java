package com.kiumitech.astute.scheme.service;

import com.kiumitech.astute.scheme.domain.SchemeEntity;
import com.kiumitech.astute.scheme.dto.data.SchemeCO;
import com.kiumitech.astute.scheme.dto.data.SchemeFieldCO;
import lombok.NonNull;

import java.util.stream.Collectors;

public class SchemeAssembler {

    public static SchemeCO assemble(@NonNull SchemeEntity entity) {
        SchemeCO ret = new SchemeCO();
        ret.setId(entity.getId());
        ret.setName(entity.getName());
        ret.setProperty(entity.getProperty());
        ret.setNotes(entity.getNotes());
        ret.setFields(entity.getFields().stream()
                .map(p -> {
                    SchemeFieldCO item = new SchemeFieldCO();
                    item.setFormat(p.getFormat());
                    item.setProperty(p.getProperty());
                    item.setNotes(p.getNotes());
                    item.setName(p.getName());
                    item.setType(p.getType().name());
                    return item;
                }).collect(Collectors.toList()));
        return ret;
    }
}
