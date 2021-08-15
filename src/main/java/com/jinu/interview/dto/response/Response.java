package com.jinu.interview.dto.response;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Response implements Serializable {
	private static final long serialVersionUID = -2656335726856017828L;
	private String status;
	private String message;
}
