package com.kiumitech.astute.scheme.domain;

import java.util.Optional;

public interface SchemeGateway {

    Optional<SchemeEntity> findOne(Long id);

    SchemeEntity save(SchemeEntity schemeEntity);

    void saveAll(Iterable<SchemeEntity> schemeEntities);
}
