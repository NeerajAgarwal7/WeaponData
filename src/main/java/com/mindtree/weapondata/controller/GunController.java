package com.mindtree.weapondata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.weapondata.entity.Gun;
import com.mindtree.weapondata.service.GunService;

@RestController
public class GunController {
	
	@Autowired
	public GunService gunSer;

	@RequestMapping(method=RequestMethod.POST,value="/addGun")
	public void addGun(@RequestBody Gun gun) {
		gunSer.addNewGun(gun);
	}
	
	@RequestMapping("/guns")
	public List<Gun> getGuns(){
		return gunSer.getAllGuns();
	}
	
	@RequestMapping("/guns/{id}")
	public Gun getGunById(@PathVariable int id) {
		return gunSer.getGun(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/upGun")
	public void updateGunData(@RequestBody Gun gun) {
		gunSer.updateGun(gun);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/delGun/{id}")
	public void delGun(@PathVariable int id) {
		gunSer.deleteGun(id);
	}
	
}
