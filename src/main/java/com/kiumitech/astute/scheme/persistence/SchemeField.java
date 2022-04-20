package com.kiumitech.astute.scheme.persistence;

import com.kiumitech.astute.basis.DataObject;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ast_scheme_field")
@Data
@EqualsAndHashCode(callSuper = true)
public class SchemeField extends DataObject {

    @Column(name = "scheme_id", nullable = false)
    private Long schemeId;
    @Column(name = "name", nullable = false, length = 40)
    private String name;
    @Column(name = "type", nullable = false, length = 40)
    private String type;
    @Column(name = "format", nullable = false, length = 40)
    private String format;
    @Column(name = "property", nullable = false, length = 40)
    private String property;
    @Column(name = "notes", nullable = false, length = 100)
    private String notes = "";
}
