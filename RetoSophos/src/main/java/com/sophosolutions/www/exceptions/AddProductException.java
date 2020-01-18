package com.sophosolutions.www.exceptions;

import org.openqa.selenium.ElementNotVisibleException;

public class AddProductException extends ElementNotVisibleException {

    
    public AddProductException(String message, Throwable cause) {
        super(message, cause);
    }
}
