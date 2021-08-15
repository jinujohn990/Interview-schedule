package com.jinu.interview.dto.request;

import java.io.Serializable;

import lombok.Data;
@Data
public class AddCandidateRequest implements Serializable{

	private static final long serialVersionUID = -7587856633371428947L;
	private String name;
	private String email;
	private String phone;
	private String interviewerId;
}
