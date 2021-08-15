package com.jinu.interview.dto.request;
import lombok.Data;
import lombok.EqualsAndHashCode;
@Data
@EqualsAndHashCode(callSuper = true)
public class AddInterviewerRequest extends AddUserRequest {
	private static final long serialVersionUID = -5537074841011397663L;
	private String name;
}
