package com.kiumitech.astute.scheme.controller;

import com.kiumitech.astute.basis.SingleResponse;
import com.kiumitech.astute.scheme.dto.SchemeAddCmd;
import com.kiumitech.astute.scheme.dto.data.SchemeCO;
import com.kiumitech.astute.scheme.service.SchemeApplicationService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class SchemeController {
    private SchemeApplicationService schemeApplicationService;

    public SingleResponse<SchemeCO> addScheme(@NonNull @RequestBody SchemeAddCmd cmd) {
        return schemeApplicationService.addScheme(cmd);
    }
}
