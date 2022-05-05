package com.kiumitech.astute.scheme.executor;

import com.kiumitech.astute.basis.SingleResponse;
import com.kiumitech.astute.scheme.dto.SchemeUpdateCmd;
import com.kiumitech.astute.scheme.dto.data.SchemeCO;
import com.kiumitech.astute.scheme.persistence.SchemeFieldRepository;
import com.kiumitech.astute.scheme.persistence.SchemeRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SchemeUpdateCmdExe {

    private final SchemeRepository schemeRepository;
    private final SchemeFieldRepository schemeFieldRepository;

    public SingleResponse<SchemeCO> updateScheme(@NonNull SchemeUpdateCmd cmd) {
        return null;
    }
}
