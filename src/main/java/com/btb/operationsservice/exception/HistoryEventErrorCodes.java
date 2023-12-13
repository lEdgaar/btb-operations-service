package com.btb.operationsservice.exception;

public enum HistoryEventErrorCodes implements ErrorCode {

    USER_ID_NOT_NULL(1, "user.id.not.null"),
            ;

    private final int code;

    private final String key;

    HistoryEventErrorCodes(int code, String key) {
        this.code = code;
        this.key = key;
    }

    @Override
    public int getCode() {
        return 0;
    }

    @Override
    public String getKey() {
        return null;
    }
}
