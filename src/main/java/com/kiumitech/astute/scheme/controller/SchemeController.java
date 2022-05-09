package com.kiumitech.astute.scheme.controller;

import com.kiumitech.astute.basis.SingleResponse;
import com.kiumitech.astute.scheme.dto.SchemeAddCmd;
import com.kiumitech.astute.scheme.dto.SchemeFindOneQry;
import com.kiumitech.astute.scheme.dto.SchemeUpdateCmd;
import com.kiumitech.astute.scheme.dto.data.SchemeCO;
import com.kiumitech.astute.scheme.service.SchemeApplicationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/scheme")
@Api(value = "Scheme endpoint", tags = {"Scheme"})
public class SchemeController {
    private final SchemeApplicationService schemeApplicationService;

    @ApiOperation("Add scheme")
    @PostMapping
    public SingleResponse<SchemeCO> addScheme(@NonNull @RequestBody SchemeAddCmd cmd) {
        return schemeApplicationService.addScheme(cmd);
    }

    @ApiOperation("Update scheme")
    @PutMapping
    public SingleResponse<SchemeCO> updateScheme(@NonNull @RequestBody SchemeUpdateCmd cmd) {
        return schemeApplicationService.updateScheme(cmd);
    }

    @ApiOperation("Find One")
    @GetMapping("/{id}")
    public SingleResponse<SchemeCO> getScheme(@ApiParam(name = "id", value = "Scheme Id", required = true, defaultValue = "0") @PathVariable Long id) {
        SchemeFindOneQry qry = new SchemeFindOneQry();
        qry.setId(id);
        return schemeApplicationService.findOne(qry);
    }
}
