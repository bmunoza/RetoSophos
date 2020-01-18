package com.sophosolutions.www.exceptions;

import net.thucydides.core.webdriver.UnsupportedDriverException;

public class OpenTheBrowserException extends UnsupportedDriverException {

    public static final String DRIVER_FAILED_MESSAGE = "Browser Driver failure";

    public OpenTheBrowserException(String message ,Throwable testErrorException) {
        super(message,testErrorException);
    }
}
