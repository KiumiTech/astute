package com.kiumitech.astute.scheme.service;

import com.kiumitech.astute.basis.SingleResponse;
import com.kiumitech.astute.scheme.dto.SchemeAddCmd;
import com.kiumitech.astute.scheme.dto.data.SchemeCO;
import com.kiumitech.astute.scheme.executor.SchemeAddCmdExe;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SchemeApplicationService {

    private final SchemeAddCmdExe schemeAddCmdExe;

    public SingleResponse<SchemeCO> addScheme(@NonNull SchemeAddCmd cmd) {
        return schemeAddCmdExe.execute(cmd);
    }
}
