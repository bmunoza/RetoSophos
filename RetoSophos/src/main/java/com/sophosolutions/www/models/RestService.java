package com.sophosolutions.www.models;

public enum RestService {

	BASE_URL("https://gorest.co.in"),
	CREATE_USER("/users"), 
	CONSULT_USER("/public-api/users/1?access-token=5vt37qISEJmVQ8Ud815otdoIjfsRS_f8Bx31");

	private String uri;

	RestService(String uri) {
		this.uri = uri;
	}

	@Override
	public String toString() {
		return uri;
	}

}
