package com.certificate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.shashank.entity.Certificate;
import com.shashank.service.CertificateService;

@RestController
@RequestMapping("/certificate")
public class CertificateController {
	
	@Autowired
	CertificateService certificateService;

	public CertificateService getCertificateService() {
		return certificateService;
	}

	public void setCertificateService(CertificateService certificateService) {
		this.certificateService = certificateService;
	}
	
	// http://localhost:8071/certificate/create
	@PostMapping("/create")
	public Certificate addCertificate(@RequestBody Certificate certificate)
	{
		return certificateService.save(certificate);
	}
	
	// http://localhost:8071/certificate/34
	@GetMapping(path="/{id}")
	public Certificate getCertificate(@PathVariable int id)
	{
		return certificateService.getCertificate(id);
	}
	
	@PutMapping(path="{/id}")
	public Certificate updateCertificate(@RequestBody Certificate certificate,@PathVariable int id)
	{
		return certificateService.update(id, certificate);
	}
	
	@DeleteMapping(path="{/id}")
	public String deleteCertificate(@PathVariable int id)
	{
		return certificateService.delete(id);
	}
	
	@GetMapping
	public List<Certificate> getAllCertificate()
	{
		return certificateService.getCertlist();
	}
	
}
