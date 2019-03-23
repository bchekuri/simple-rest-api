package org.innovate.samplemicroservice.model;

/**
 *
 * @author BChekuri
 *
 */
public class ApplicationDTO {

	private String message;
	
	

	public ApplicationDTO(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
