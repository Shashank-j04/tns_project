package com.shashank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shashank.entity.Certificate;

@Repository
public interface CertificateRepository extends JpaRepository<Certificate,Integer>{
	
}
