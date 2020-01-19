package com.sophosolutions.www.models;

public enum RestService {

	BASE_URL("https://gorest.co.in"),
	CONSULT_USER("/public-api/users/9?access-token=m0LoGCn_7FCIITpg9FMzstcvDTQToCSTyrDR");

	private String uri;

	RestService(String uri) {
		this.uri = uri;
	}

	@Override
	public String toString() {
		return uri;
	}

}
