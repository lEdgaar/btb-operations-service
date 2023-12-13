package com.btb.operationsservice.exception;

public enum EventTypeErrorCodes implements ErrorCode {

    EVENT_TYPE_NOT_FOUND(1, "event.type.not.found"),
    EVENT_TYPE_INTERNAL_CODE_NOT_NULL(2, "event.type.internal.code.not.null"),
    ;

    private final int code;

    private final String key;

    EventTypeErrorCodes(int code, String key) {
        this.code = code;
        this.key = key;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getKey() {
        return key;
    }

}
