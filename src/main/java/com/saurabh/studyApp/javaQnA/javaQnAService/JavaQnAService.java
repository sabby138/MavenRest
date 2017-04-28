package com.saurabh.studyApp.javaQnA.javaQnAService;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.saurabh.studyApp.javaQnA.model.JavaQnADO;
import com.saurabh.studyApp.utilities.FileReadingUtility;

@Path("/javaQnA")
public class JavaQnAService {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<JavaQnADO> getAllJavaQuestions(){
		
			List<JavaQnADO> questList = FileReadingUtility.readQuestionsFromFile();
		return questList;
		
	}
}
