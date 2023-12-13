package com.btb.operationsservice.exception;

public class HistoryEventException extends CommonApiException {

    public HistoryEventException(ErrorCode errorCode, String message) {
        super(errorCode, message);
    }
}
