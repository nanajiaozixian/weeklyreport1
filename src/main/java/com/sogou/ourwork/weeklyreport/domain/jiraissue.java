package com.sogou.ourwork.weeklyreport.domain;

import java.io.Serializable;

public class jiraissue implements Serializable{
	private int issueId;
	private long project;
	private char issueType;
	private String summary;
	private String description;
	private char priority;
	private char issuestatus;
}

