package com.kiumitech.astute.scheme.executor;

import com.kiumitech.astute.basis.SingleResponse;
import com.kiumitech.astute.scheme.domain.SchemeEntity;
import com.kiumitech.astute.scheme.domain.SchemeGateway;
import com.kiumitech.astute.scheme.dto.SchemeFindOneQry;
import com.kiumitech.astute.scheme.dto.data.SchemeCO;
import com.kiumitech.astute.scheme.service.SchemeAssembler;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SchemeFindOneQryExe {

    private final SchemeGateway schemeGateway;

    public SingleResponse<SchemeCO> execute(@NonNull SchemeFindOneQry qry) {
        SchemeEntity schemeEntity = schemeGateway.findOne(qry.getId())
                .orElseThrow(RuntimeException::new);
        return SingleResponse.of(SchemeAssembler.assemble(schemeEntity));
    }
}
