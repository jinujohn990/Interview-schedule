package com.jinu.interview.dto.request;
import java.io.Serializable;

import lombok.Data;
@Data
public class UpdateInterviewDetailsRequest implements Serializable{
	private static final long serialVersionUID = -1447342196246913470L;
	private long interviewScheduleId;
	private String remarks;
	private String status;
}
