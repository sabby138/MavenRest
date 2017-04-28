package com.saurabh.studyApp.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;

import com.saurabh.studyApp.javaQnA.model.JavaQnADO;

public class FileReadingUtility {

	public static List<JavaQnADO> readQuestionsFromFile(){
		List<JavaQnADO> questList = new ArrayList<JavaQnADO>(); 
		String lines  = "";
		WordExtractor extractor = null;
		try(FileInputStream fis = new FileInputStream("E:\\JavaQnA\\java.doc")){


			HWPFDocument document = new HWPFDocument(fis);
			extractor = new WordExtractor(document);
			String[] fileData = extractor.getParagraphText();
			for (int i = 0; i < fileData.length; i++)
			{
				if (fileData[i] != null)
					lines = lines +fileData[i];
				System.out.println(lines);
			}
			String[] questionsArray = lines.split("Q:");
			for(String eachQuest : questionsArray){
				if((!eachQuest.equals(null)) && (!eachQuest.equals(""))){
					String[] answersArray = eachQuest.split("A:");
					if(answersArray.length > 0){
						JavaQnADO model = new JavaQnADO();
						if(answersArray[0] != null && answersArray[0] != ""){
							String question = answersArray[0];
							question = StudyAppUtilities.removeASCIISymbolsFromString(question);
							model.setQuestion(question);
						}
						if(answersArray[1] != null && answersArray[1] != ""){
							String answer = answersArray[1];
							answer = StudyAppUtilities.removeASCIISymbolsFromString(answer);
							model.setAnswer(answer);
						}
						questList.add(model);
					}
				}
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return questList;
	}
}
