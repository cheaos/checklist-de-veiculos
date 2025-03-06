package br.com.senior.chkbackend.util;

public enum ErrorCategory {
	// categories here are meant to be domain agnostic   
		BAD_REQUEST("Request invalid format"),
		UNAUTHORIZED("The request has failed necessary authorization"),
		PAYMENT_REQUIRED("Request have reach your usage limit"),
		FORBIDDEN("Request does not have necessary permission to execute such request"),
		OBJECT_NOT_FOUND("No entity instance was found with the given id"),
		REQUEST_TIMEOUT("Service timed out wating for the request"),
		GONE("Primitive is no longer available and will not be available again"),
		UNPROCESSABLE("Primitive was well-formed but server was unable to execute it due to applications conditions"),
		INTERNAL_ERROR("Internal server error"),
		NOT_IMPLEMENTED("Service does not implement or recognize requested primitive"),
		SERVICE_UNAVAILABLE("Service is unavailable due to overload or maintanance"),
		INSUFFICIENT_STORAGE("Service is unable to store the representation needed to complete de request"),
		CONFLICT("The request could not be completed due to a conflict."),
		BAD_GATEWAY("Service received an invalid response from the upstream server.");
		
		
		ErrorCategory(String userMessage) {
			this.defaultUserMessage = userMessage;
		}
		private String defaultUserMessage;
		
		public String getDefaultUserMessage() {
			return defaultUserMessage;
		}
}

