package com.kiumitech.astute.scheme.executor;

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
public class SchemeAddCmdExe extends SchemeBaseExecutor {

    private final SchemeGateway schemeGateway;

    public SingleResponse<SchemeCO> execute(SchemeAddCmd cmd) {
        SchemeEntity schemeEntity = new SchemeEntity();

        populateDataToSchemeEntity(schemeEntity, cmd);

        return SingleResponse.of(
                SchemeAssembler.assemble(
                        schemeGateway.save(schemeEntity)));
    }
}
