package com.springrest.springrest.services;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
//	List<Course> list;
	@Autowired
	private CourseDao courseDao;
	
	public CourseServiceImpl() {
//		list = new ArrayList<>();
//		list.add(new Course(10, "Core Java", "This course contains concept of core Java"));
//		list.add(new Course(11, "Advance Java", "This course contains concept of Advance Java"));
	}

	@Override
	public List<Course> getAllCourses() {
		return courseDao.findAll();
//		return list;
	}

	@Override
	public Course getCourseById(long courseId) {
//		Course c = null;
//		
//		for (Course course : list) {
//			if(course.getId() == courseId) {
//				c = course;
//				break;
//			}
//		}
//		return c;
		return courseDao.findById(courseId).get();
	}

	@Override
	public Course addCourse(Course course) {
//		list.add(course);
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
//		Course c = null;
//		
//		for (Course cour : list) {
//			if(cour.getId() == course.getId()) {
//				c = course;
//				cour.setTitle(course.getTitle());
//				cour.setDiscription(course.getDiscription());
//				break;
//			}
//		}
//		return c;
		
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long courseId) {
//		Course c = null;
//		for (Course course : list) {
//			if(course.getId() == courseId) {
//				c = course;
//				list.remove(course);
//				break;
//			}
//		}
//		return c;
//		list=this.list.stream().filter(e -> e.getId() != courseId).collect(Collectors.toList());
		
		Course entity = courseDao.getOne(courseId);
		courseDao.delete(entity);
	}
}
