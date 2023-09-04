package com.blitz.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blitz.entity.Coupon;

@Repository
public interface CouponRepository extends JpaRepository<Coupon, Integer> {
	Coupon findByCode(String code);
	
	List<Coupon> findByCodeContaining(String code);
}
