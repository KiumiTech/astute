package com.kiumitech.astute.scheme.executor;

import com.kiumitech.astute.basis.SingleResponse;
import com.kiumitech.astute.scheme.domain.SchemeEntity;
import com.kiumitech.astute.scheme.domain.SchemeGateway;
import com.kiumitech.astute.scheme.dto.SchemeUpdateCmd;
import com.kiumitech.astute.scheme.dto.data.SchemeCO;
import com.kiumitech.astute.scheme.service.SchemeAssembler;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SchemeUpdateCmdExe extends SchemeBaseExecutor {

    private final SchemeGateway schemeGateway;

    public SingleResponse<SchemeCO> execute(@NonNull SchemeUpdateCmd cmd) {
        SchemeEntity schemeEntity = schemeGateway.findOne(cmd.getId())
                .orElseThrow(RuntimeException::new);

        populateDataToSchemeEntity(schemeEntity, cmd);

        return SingleResponse.of(
                SchemeAssembler.assemble(
                        schemeGateway.save(schemeEntity)));
    }
}
