package com.example.learn.repo.abstractRepo;

import com.example.learn.entity.abstractEntity.AbstractEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface AbstractRepository<T extends AbstractEntity, ID extends Serializable> extends JpaRepository<T,ID> {
}
