package com.kiumitech.astute.scheme.persistence;

import com.kiumitech.astute.basis.DataObject;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ast_scheme")
@Data
@EqualsAndHashCode(callSuper = true)
public class Scheme extends DataObject {

    @Column(name = "name", nullable = false, length = 40)
    private String name;

    @Column(name = "property", nullable = false, length = 40)
    private String property;

    @Column(name = "notes", nullable = false, length = 100)
    private String notes = "";
}
