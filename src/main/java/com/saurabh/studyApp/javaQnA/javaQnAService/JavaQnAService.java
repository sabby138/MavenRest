package com.saurabh.studyApp.javaQnA.javaQnAService;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.saurabh.studyApp.javaQnA.model.JavaQnADO;
import com.saurabh.studyApp.utilities.FileReadingUtility;

@Path("/javaQnA")
@Produces(MediaType.APPLICATION_JSON)
public class JavaQnAService {

	@GET
	public JavaQnADO getAllJavaQuestions(){
		JavaQnADO javaQnADO = new JavaQnADO();
			List<JavaQnADO> questList = FileReadingUtility.readQuestionsFromFile();
			javaQnADO.setQuestList(questList);
			javaQnADO.setListTitle("Java Questions");
		return javaQnADO;
		 
	}
}
