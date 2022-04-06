package com.college.abcinstitute;

import javax.transaction.Transactional;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
class AbcinstituteApplicationTests {

	@Autowired
	private MockMvc mockmvc;
	
	@Test
	@Transactional
	public void testAddCourse() throws Exception {
		String course = "{\"courseId\":\"1\",\"courseName\":\"CSE\",\"duration\":\"3\"}";
		mockmvc.perform(MockMvcRequestBuilders.post("/addcourse")
				.contentType(MediaType.APPLICATION_JSON)
				.content(course)
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andReturn();
	}
	
	@Test
	@Transactional
	public void testUpdateCourse() throws Exception {
		String course = "{\"courseId\":\"1\",\"courseName\":\"CSE\",\"duration\":\"3\"}";
		mockmvc.perform(MockMvcRequestBuilders.put("/updatecourse")
				.contentType(MediaType.APPLICATION_JSON)
				.content(course)
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andReturn();
	}
	
	@Test
	@Transactional
	public void testGetCourse() throws Exception {
		mockmvc.perform(MockMvcRequestBuilders.get("/getallcourses")
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andReturn();
	}
	
	@Test
	@Transactional
	public void testDeleteCourse() throws Exception {
		mockmvc.perform(MockMvcRequestBuilders.delete("/deleteallcourses")
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andReturn();
	}

}
