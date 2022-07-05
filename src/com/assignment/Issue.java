package com.assignment;

public class Issue {
	private final String name;
	private final IssueTypes type;
	private final String path;
	public Issue(String fileName, IssueTypes type, String filePath){
		this.name = fileName;
		this.type = type;
		this.path = filePath;
	}
	public String getName() {
		return name;
	}
	public IssueTypes getType() {
		return type;
	}
	public String getPath() {
		return path;
	}
}
