package com.informationasset.repository;

import com.informationasset.model.UserRecord;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserRecord, Integer> {

}