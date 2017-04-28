package com.saurabh.studyApp;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("/UserService") public class UserService {
	
	UserDao userDao = new UserDao();
	
	@GET
	@Path("/users")
	@Produces(MediaType.APPLICATION_XML)
	public List<User> getUsers(){
		//JSONObject outputJsonObj = null;
		People people =null;
		String abc ="";
		try {
			 people = new People();
			//people.setUserList(userDao.getAllUsers());
			//JSONArray peopleJson = new JSONArray(people);
			//outputJsonObj = new JSONObject();
			//outputJsonObj.put("output", people);
			//abc = "\"Acronym\": \"SGML\",\"Abbrev\": \"ISO 8879:1986\"";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userDao.getAllUsers();   
	}

	@POST
	@Path("/users")
	@Produces(MediaType.APPLICATION_XML)
	public People getPeoples(){
		//JSONObject outputJsonObj = null;
		People people =null;
		String abc ="";
		try {
			 people = new People();
			 people.setUserList(userDao.getAllUsers());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return people;   
	}
}
