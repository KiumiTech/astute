package com.kiumitech.astute.scheme.domain.impl;

import com.kiumitech.astute.scheme.domain.SchemeConverter;
import com.kiumitech.astute.scheme.domain.SchemeEntity;
import com.kiumitech.astute.scheme.domain.SchemeGateway;
import com.kiumitech.astute.scheme.persistence.Scheme;
import com.kiumitech.astute.scheme.persistence.SchemeField;
import com.kiumitech.astute.scheme.persistence.SchemeFieldRepository;
import com.kiumitech.astute.scheme.persistence.SchemeRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class SchemeGatewayImpl implements SchemeGateway {

    private final SchemeRepository schemeRepository;
    private final SchemeFieldRepository schemeFieldRepository;

    @Override
    public Optional<SchemeEntity> findOne(@NonNull Long id) {
        Optional<Scheme> schemeOptional = schemeRepository.findById(id);
        if (schemeOptional.isPresent()) {
            Scheme scheme = schemeOptional.get();
            List<SchemeField> fieldList = schemeFieldRepository.findAllBySchemeId(scheme.getId());
            return Optional.of(SchemeConverter.of(scheme, fieldList));
        }
        return Optional.empty();
    }

    @Override
    @Transactional
    public SchemeEntity save(@NonNull SchemeEntity schemeEntity) {
        Scheme scheme;

        if (schemeEntity.isTransient()) {
            scheme = new Scheme();
        } else {
            scheme = schemeRepository.findById(schemeEntity.getId())
                    .orElseThrow(() -> new IllegalArgumentException("无效的id"));
            schemeFieldRepository.removeAllBySchemeId(scheme.getId());
        }

        scheme.setName(schemeEntity.getName());
        scheme.setProperty(schemeEntity.getProperty());
        scheme.setNotes(scheme.getNotes());
        Scheme saved = schemeRepository.save(scheme);

        List<SchemeField> schemeFields = schemeEntity.getFields().stream()
                .map(p -> {
                    SchemeField schemeField = new SchemeField();
                    schemeField.setSchemeId(saved.getId());
                    schemeField.setName(p.getName());
                    schemeField.setType(p.getType().name());
                    schemeField.setFormat(p.getFormat());
                    schemeField.setProperty(p.getFormat());
                    schemeField.setNotes(p.getNotes());
                    return schemeField;
                }).collect(Collectors.toList());

        schemeFieldRepository.saveAll(schemeFields);

        return findOne(saved.getId())
                .orElseThrow(() -> new IllegalStateException("数据持久化错误"));
    }


    @Override
    @Transactional
    public void saveAll(@NonNull Iterable<SchemeEntity> schemeEntities) {
        schemeEntities.forEach(this::save);
    }
}
