package com.kiumitech.astute.scheme.executor;

import com.kiumitech.astute.basis.SingleResponse;
import com.kiumitech.astute.scheme.dto.SchemeAddCmd;
import com.kiumitech.astute.scheme.dto.data.SchemeCO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SchemeAddCmdExe {

    public SingleResponse<SchemeCO> execute(SchemeAddCmd cmd) {
        return SingleResponse.buildSuccess();
    }
}
