package com.mindtree.weapondata.service;

import java.util.List;

import com.mindtree.weapondata.entity.Gun;

public interface GunService {

	public void addNewGun(Gun gun);
	public List<Gun> getAllGuns();
	public Gun getGun(int id);
	public void updateGun(Gun gun);
	public void deleteGun(int id);
}
