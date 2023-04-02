package com.example.dal;

import com.example.dal.entiies.AuthorityEntity;
import org.springframework.data.repository.CrudRepository;

public interface AuthorityRepository extends CrudRepository<AuthorityEntity, Integer> {

}
