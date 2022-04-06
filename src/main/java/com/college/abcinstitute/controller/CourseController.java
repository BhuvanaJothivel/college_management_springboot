package com.college.abcinstitute.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.college.abcinstitute.model.Course;
import com.college.abcinstitute.repository.CourseRepository;

@RestController
public class CourseController {
	
	@Autowired
	private CourseRepository crrepo;
	
	@PostMapping("addcourse")
	public Course addCourse(@RequestBody Course cr) {
		return crrepo.save(cr);
	}
	
	@PutMapping("updatecourse")
	public Course updateCourse(@RequestBody Course cr) {
		return crrepo.save(cr);
	}
	
	@DeleteMapping("deleteallcourses")
	public String deleteAllCourse() {
		String result;
		try {
			crrepo.deleteAll();
			result = "records deleted";
		}
		catch(Exception e) {
			result = "error occurred";
		}
		return result;
	}
	
	@DeleteMapping("deletecourse/{id}")
	public String deleteCourse(@PathVariable int id) {
		String result;
		try {
			crrepo.deleteById(id);
			result = "records deleted";
		}
		catch(Exception e) {
			result = "error occurred";
		}
		return result;
	}
	
	@GetMapping("getallcourses")
	public List<Course> getAllCourses() {
		return crrepo.findAll();
	}
	
	@GetMapping("getcoursebyid/{id}")
	public Optional<Course> getCourseById(@PathVariable int id) {
		return crrepo.findById(id);
	}
	
	@GetMapping("getcoursebyduration/{duration}")
	public List<Course> getCourseByDuration(@PathVariable int duration) {
		return crrepo.findByCourseDuration(duration);
	}
}
