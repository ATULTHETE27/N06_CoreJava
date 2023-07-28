package com.met.multilevelinheritance;
//child class (A to B)
public class TeamLead extends Manager{
	//private data members
	private String leadName;
	private String projectName;
	
	
	//getters and setters
	public String getLeadName() {
		return leadName;
	}

	public void setLeadName(String leadName) {
		this.leadName = leadName;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	//Parameterize Constructor
	public TeamLead(String deptname, String name, int empId, String leadName, String projectName) {
		super(deptname, name, empId);
		
		this.leadName=leadName;
		this.projectName=projectName;
	}

	@Override
	public String toString() {
		return "TeamLead [leadName=" + leadName + ", projectName=" + projectName + ", toString()=" + super.toString()
				+ "]";
	}
	
	

}
