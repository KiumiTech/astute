package com.kiumitech.astute.basis;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class DataObject {

    protected DataObject() {

    }

    /**
     * Entity Id
     */
    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Entity created datetime
     */
    @Getter
    @Setter
    @CreatedDate
    @Column(name = "created_on", nullable = false)
    private Date createdOn;

    /**
     * Entity last updated datetime
     */
    @Getter
    @Setter
    @LastModifiedDate
    @Column(name = "updated_on", nullable = false)
    private Date updatedOn;
}
