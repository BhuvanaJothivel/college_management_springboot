package com.college.abcinstitute.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.college.abcinstitute.model.Admission;

@Repository
public interface AdmissionRepository extends JpaRepository<Admission,Integer>{

}
