package com.kiumitech.astute.scheme.executor;

import com.kiumitech.astute.scheme.domain.SchemeEntity.Field;

import java.util.ArrayList;

import com.kiumitech.astute.basis.SingleResponse;
import com.kiumitech.astute.scheme.domain.SchemeEntity;
import com.kiumitech.astute.scheme.domain.SchemeGateway;
import com.kiumitech.astute.scheme.dto.SchemeAddCmd;
import com.kiumitech.astute.scheme.dto.data.SchemeCO;
import com.kiumitech.astute.scheme.service.SchemeAssembler;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SchemeAddCmdExe {

    private final SchemeGateway schemeGateway;

    public SingleResponse<SchemeCO> execute(SchemeAddCmd cmd) {
        SchemeEntity schemeEntity = new SchemeEntity();

        schemeEntity.setName(cmd.getName());
        schemeEntity.setFields(new ArrayList<Field>());
        schemeEntity.setNotes(cmd.getNotes());
        schemeEntity.setProperty(cmd.getProperty());

        return SingleResponse.of(
                SchemeAssembler.assemble(
                        schemeGateway.save(schemeEntity)));
    }
}
