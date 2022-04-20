package com.kiumitech.astute.scheme.domain.impl;

import com.kiumitech.astute.scheme.domain.SchemeEntity;
import com.kiumitech.astute.scheme.domain.SchemeGateway;
import com.kiumitech.astute.scheme.persistence.SchemeFieldRepository;
import com.kiumitech.astute.scheme.persistence.SchemeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class SchemeGatewayImpl implements SchemeGateway {

    private final SchemeRepository schemeRepository;
    private final SchemeFieldRepository schemeFieldRepository;

    @Override
    public Optional<SchemeEntity> findOne(Long id) {
        return Optional.empty();
    }

    @Override
    @Transactional
    public SchemeEntity save(SchemeEntity schemeEntity) {
        return null;
    }

    @Override
    @Transactional
    public void saveAll(Iterable<SchemeEntity> schemeEntities) {

    }
}
