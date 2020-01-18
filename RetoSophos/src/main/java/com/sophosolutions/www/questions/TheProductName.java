package com.sophosolutions.www.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class TheProductName implements Question<String> {

    private Target target;

    public TheProductName (Target target){
        this.target = target;
    }


    @Override
    public String answeredBy(Actor actor) {
        return Text.of(target).viewedBy(actor).asString();
    }

    public static TheProductName is(Target target){
        return new TheProductName(target);
    }
}
