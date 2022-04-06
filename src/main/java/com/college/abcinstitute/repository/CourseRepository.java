package com.college.abcinstitute.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.college.abcinstitute.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course,Integer>{
	public List<Course> findByCourseDuration(int duration);
}
