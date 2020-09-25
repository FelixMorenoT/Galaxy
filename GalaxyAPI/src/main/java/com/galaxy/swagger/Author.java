package com.galaxy.swagger;

public class Author {

	private String fullName;
	private String gitHub;
	private String linkedin;
	
	public Author() {
		
	}

	public Author(String fullName, String gitHub, String linkedin) {
		this.fullName = fullName;
		this.gitHub = gitHub;
		this.linkedin = linkedin;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getGitHub() {
		return gitHub;
	}

	public void setGitHub(String gitHub) {
		this.gitHub = gitHub;
	}

	public String getLinkedin() {
		return linkedin;
	}

	public void setLinkedin(String linkedin) {
		this.linkedin = linkedin;
	}
}
