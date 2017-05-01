package com.saurabh.studyApp.javaQnA.model;

import java.util.List;

public class JavaQnADO {

	private Long serialNo;
	private String question;
	private String answer;
	private List<JavaQnADO> questList;
	private String listTitle;
	
	public  JavaQnADO() {
		
	}
	
	public Long getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(Long serialNo) {
		this.serialNo = serialNo;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public List<JavaQnADO> getQuestList() {
		return questList;
	}

	public void setQuestList(List<JavaQnADO> questList) {
		this.questList = questList;
	}

	public String getListTitle() {
		return listTitle;
	}

	public void setListTitle(String listTitle) {
		this.listTitle = listTitle;
	}
}
