package com.mindtree.weapondata.dao;

import org.springframework.data.repository.CrudRepository;

import com.mindtree.weapondata.entity.Gun;

public interface GunDao extends CrudRepository<Gun, Integer> {

}