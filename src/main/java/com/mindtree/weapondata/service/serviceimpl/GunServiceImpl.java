package com.mindtree.weapondata.service.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.weapondata.dao.GunDao;
import com.mindtree.weapondata.entity.Gun;
import com.mindtree.weapondata.service.GunService;

@Service
public class GunServiceImpl implements GunService {

	@Autowired
	public GunDao gunDao;

	@Override
	public void addNewGun(Gun gun) {
		gunDao.save(gun);
	}

	@Override
	public List<Gun> getAllGuns() {
		List<Gun> gunList = new ArrayList<Gun>();
		gunDao.findAll().forEach(gunList::add);
		return gunList;
	}

	@Override
	public Gun getGun(int id) {
		return gunDao.findOne(id);
	}

	@Override
	public void updateGun(Gun gun) {
		gunDao.save(gun);
	}

	@Override
	public void deleteGun(int id) {
		gunDao.delete(id);
	}

}
