package com.btb.operationsservice.exception;

public class EventTypeException extends CommonApiException {

    public EventTypeException(ErrorCode errorCode, String message) {
        super(errorCode, message);
    }
}
