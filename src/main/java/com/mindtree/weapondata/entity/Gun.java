package com.mindtree.weapondata.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Gun {

	@Id
	private int gunNum;
	private String gunName;
	private double caliber;

	public int getGunNum() {
		return gunNum;
	}

	public void setGunNum(int gunNum) {
		this.gunNum = gunNum;
	}

	public String getGunName() {
		return gunName;
	}

	public void setGunName(String gunName) {
		this.gunName = gunName;
	}

	public double getCaliber() {
		return caliber;
	}

	public void setCaliber(double caliber) {
		this.caliber = caliber;
	}

	public Gun(int gunNum, String gunName, double caliber) {
		this.gunNum = gunNum;
		this.gunName = gunName;
		this.caliber = caliber;
	}

	public Gun() {
	}

	@Override
	public String toString() {
		return "Gun [gunNum=" + gunNum + ", gunName=" + gunName + ", caliber=" + caliber + "]";
	}
}
