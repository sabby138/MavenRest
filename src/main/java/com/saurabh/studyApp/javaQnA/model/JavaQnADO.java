package com.saurabh.studyApp.javaQnA.model;

public class JavaQnADO {

	private Long serialNo;
	private String question;
	private String answer;
	
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
}
