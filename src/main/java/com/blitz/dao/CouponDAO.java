package com.blitz.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.blitz.entity.Coupon;
import com.blitz.repository.CouponRepository;

@Component
public class CouponDAO {

	@Autowired
	private CouponRepository repository;

	public Coupon getCoupons(String code) {
		return repository.findByCode(code);
	}
	
	public List<Coupon> getCouponsContaining(String code) {
		return repository.findByCodeContaining(code);
	}

	public Coupon saveCoupon(Coupon coupon) {
		return repository.save(coupon);
	}

	public Coupon deleteCoupon(String code) {
		Coupon findCouponByCode = repository.findByCode(code);
		repository.delete(findCouponByCode);
		return findCouponByCode;
	}

	public List<Coupon> getCoupons() {
		return repository.findAll();
	}

	public Coupon updateCoupon(Coupon coupon) {
		return repository.save(coupon);
	}
	
}
