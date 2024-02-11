package com.shashank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shashank.entity.Certificate;
import com.shashank.repository.CertificateRepository;

@Service
public class CertificateService {
	@Autowired
	CertificateRepository certificateRepository;
	
	
	public CertificateRepository getCertificateRepository() {
		return certificateRepository;
	}

	public void setCertificateRepository(CertificateRepository certificateRepository) {
		this.certificateRepository = certificateRepository;
	}

	public Certificate save(Certificate cert)
	{
		return certificateRepository.save(cert);
	}
	
	public Certificate getCertificate(int id)
	{
		return certificateRepository.findById(id).get();
	}
	
	public Certificate update(int id, Certificate certificate)
	{
		Certificate certs=certificateRepository.findById(id).get();
		certs.setYear(certificate.getYear());
		certs.setCollege(certificate.getCollege());
		return certificateRepository.save(certs);
	}
	
	public String delete(int id) 
	{
		certificateRepository.deleteById(id);
		return "Entity Deleted" + id;
	}
	
	public List<Certificate> getCertlist()
	{
		return certificateRepository.findAll();
	}
	
	
}
