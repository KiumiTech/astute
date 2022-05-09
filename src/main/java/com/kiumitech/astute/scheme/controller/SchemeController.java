package com.kiumitech.astute.scheme.controller;

import com.kiumitech.astute.basis.SingleResponse;
import com.kiumitech.astute.scheme.dto.SchemeAddCmd;
import com.kiumitech.astute.scheme.dto.SchemeUpdateCmd;
import com.kiumitech.astute.scheme.dto.data.SchemeCO;
import com.kiumitech.astute.scheme.service.SchemeApplicationService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/scheme")
public class SchemeController {
    private final SchemeApplicationService schemeApplicationService;

    @PostMapping
    public SingleResponse<SchemeCO> addScheme(@NonNull @RequestBody SchemeAddCmd cmd) {
        return schemeApplicationService.addScheme(cmd);
    }

    @PutMapping
    public SingleResponse<SchemeCO> updateScheme(@NonNull @RequestBody SchemeUpdateCmd cmd) {
        return schemeApplicationService.updateScheme(cmd);
    }
}
