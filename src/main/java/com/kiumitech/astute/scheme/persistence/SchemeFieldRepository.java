package com.kiumitech.astute.scheme.persistence;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SchemeFieldRepository extends CrudRepository<SchemeField, Long> {

    List<SchemeField> findAllBySchemeId(Long schemeId);

    void removeAllBySchemeId(Long schemeId);
}
