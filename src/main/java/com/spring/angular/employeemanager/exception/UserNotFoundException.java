package com.spring.angular.employeemanager.exception;

public class UserNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2379525387595710942L;

	public UserNotFoundException(String message) {
		super(message);
	}
}
