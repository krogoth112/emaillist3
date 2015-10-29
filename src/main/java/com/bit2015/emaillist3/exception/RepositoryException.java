package com.bit2015.emaillist3.exception;

public class RepositoryException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public RepositoryException() {
		super( "Repository Exception" );
	}
	
	public RepositoryException( String message ) {
		super( message );
	}
}
