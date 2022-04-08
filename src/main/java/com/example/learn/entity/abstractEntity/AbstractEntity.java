package com.example.learn.entity.abstractEntity;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
@Data
@MappedSuperclass
public abstract class AbstractEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
}
