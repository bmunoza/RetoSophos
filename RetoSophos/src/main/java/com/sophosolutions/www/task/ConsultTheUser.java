package com.sophosolutions.www.task;


import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

public class ConsultTheUser implements Task {
	
	 	private String user;

	    public ConsultTheUser( String user) {
	    	this.user = user;
	    }

	    @Override
	    public <T extends Actor> void performAs(T actor) {
	        actor.attemptsTo(Get.resource(user)
	        );
	    }

	    public static ConsultTheUser withTheData( String user) {
	        return instrumented(ConsultTheUser.class,user);
	    }

}
