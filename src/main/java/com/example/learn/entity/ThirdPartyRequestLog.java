package com.example.learn.entity;

import com.example.learn.entity.abstractEntity.AbstractEntity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Setter
@Getter
@Entity
@Table(name = "third_party_request_log")
public class ThirdPartyRequestLog extends AbstractEntity {

    @Column(name = "student_name",nullable = false)
    private String studentName;

    @Column(name = "mobile_number",nullable = false)
    private String mobileNumber;

    @Column(name = "description")
    private String description;

    @Column(name = "status", nullable = false)
    private String status;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "request_date")
    private Date requestDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "last_modify_date")
    private Date lastModifyDate;
}
