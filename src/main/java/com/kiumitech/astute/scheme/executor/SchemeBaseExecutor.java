package com.kiumitech.astute.scheme.executor;

import com.kiumitech.astute.scheme.domain.SchemeEntity;
import com.kiumitech.astute.scheme.domain.SchemeEntity.FieldType;
import com.kiumitech.astute.scheme.dto.SchemeAddCmd;
import lombok.NonNull;

import java.util.List;
import java.util.stream.Collectors;

public abstract class SchemeBaseExecutor {

    public void populateDataToSchemeEntity(@NonNull SchemeEntity schemeEntity, @NonNull SchemeAddCmd cmd) {
        schemeEntity.setName(cmd.getName());
        schemeEntity.setNotes(cmd.getNotes());
        schemeEntity.setProperty(cmd.getProperty());
        schemeEntity.setFields(createSchemeFields(cmd));
    }

    private List<SchemeEntity.Field> createSchemeFields(SchemeAddCmd cmd) {
        return cmd.getFields().stream()
                .map(p -> {
                    SchemeEntity.Field item = new SchemeEntity.Field();
                    item.setName(p.getName());
                    item.setType(FieldType.valueOf(p.getType()));
                    item.setFormat(p.getFormat());
                    item.setNotes(p.getNotes());

                    return item;
                }).collect(Collectors.toList());
    }
}
