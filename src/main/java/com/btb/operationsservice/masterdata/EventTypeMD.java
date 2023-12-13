package com.btb.operationsservice.masterdata;

public enum EventTypeMD {

    USERS_ORGANIZATIONS_SERVICE("USERS AND ORGANIZATIONS SERVICE", "UOS"),
    BRIEFCASE_SERVICE("BRIEFCASE SERVICE", "BS"),
    TRANSACTIONS_SERVICE("TRANSACTIONS SERVICE", "TS"),
    NOTIFICATION_CHAT_SERVICE("NOTIFICATION CHAT SERVICE", "NCS"),
    GROUPS_SERVICE("GROUPS SERVICE", "GS"),
    SECURITY_SERVICE("SECURITY SERVICE", "SS"),
    REPORTS_SERVICE("REPORTS SERVICE", "RS")
    ;

    private String name;

    private String internalCode;

    EventTypeMD(String name, String internalCode) {
        this.name = name;
        this.internalCode = internalCode;
    }
}
