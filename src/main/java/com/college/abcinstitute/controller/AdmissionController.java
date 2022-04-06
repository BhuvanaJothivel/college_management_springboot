package com.college.abcinstitute.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.college.abcinstitute.model.Admission;
import com.college.abcinstitute.repository.AdmissionRepository;

@RestController
public class AdmissionController {

	@Autowired
	private AdmissionRepository adrepo;
	
	@PostMapping("addadmission")
	public Admission addCourse(@RequestBody Admission ad) {
		return adrepo.save(ad);
	}
}
