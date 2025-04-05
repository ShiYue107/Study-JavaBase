package com.itkoma.Model;

public class StuClass {

	private String classId;
	private String className;
	private String grade;
	public StuClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StuClass(String classId, String className, String grade) {
		super();
		this.classId = classId;
		this.className = className;
		this.grade = grade;
	}
	public String getClassId() {
		return classId;
	}
	public void setClassId(String classId) {
		this.classId = classId;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return "StuClass [classId=" + classId + ", className=" + className + ", grade=" + grade + "]";
	}
	
	

}
