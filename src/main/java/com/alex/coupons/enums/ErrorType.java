package com.alex.coupons.enums;

public enum ErrorType {
    GENERAL_ERROR(1000, "A general error has occurred, please try again later"),
    UPDATE_ERROR(1001, "Updating failed, no rows affected"),
    DELETE_ERROR(1003,"Deleting failed, no rows affected"),
    UNAUTHORIZED(1004,"Invalid sing in information"),

    INVALID_USER_NAME(2001, "UserName must be contains between 1 - 45 characters "),
    INVALID_PASSWORD(2002, "Password is not correct"),
    INVALID_USER_TYPE(2003, "Type must be Customer/Company/Admin"),
    USER_NAME_ALREADY_EXIST(2004,"Username already exist, please use another one"),
    NOT_AUTHORIZED_UPDATE(2005,"Not authorized update"),
    USER_DO_NOT_EXIST (2006, "User id is not exist"),

    INVALID_COMPANY_ID(3001, "Invalid company ID"), //  suppose to be in Users Logic??

    INVALID_PURCHASE_AMOUNT(4001, "Invalid purchase ID"),
    INVALID_PURCHASE_TIMESTAMP(4002,"Invalid purchase date??"), // not sure needed??

    INVALID_NAME(5001, "Name must contain between 1 - 45 characters"),
    INVALID_PHONE(5002, "Invalid phone number, must contain between 9 and 45 characters"),
    INVALID_ADDRESS(5003, "The  address  must contain up to 45 characters"),

    INVALID_COUPON_TITLE(6001 , " Invalid coupon title "),
    INVALID_COUPON_DESCRIPTION(6002, "Invalid coupon description"),
    INVALID_COUPON_TYPE(6003,"Invalid coupon type"),// why i didn't use it?
    INVALID_COUPON_DATE(6004,"Invalid coupon date"),
    INVALID_COUPON_END_DATE(6005,"Start date must be earlier than the end date"),
    INVALID_COUPON_AMOUNT(6006, "Coupon amount is not valid"),
    INVALID_COUPON_PRICE(6007,"Price have to be grater than 0"),
    INVALID_COUPON_URL_IMAGE(6008,"ImageURL must contain less than 100 characters"),

    INVALID_CATEGORY_NAME(7001, "Please enter valid name"),
    INVALID_CATEGORY_ID(7002, "Wrong category id");

    private int internalError;
    private String clientErrorMessage;

    ErrorType(int internalError, String clientErrorMessage) {
        this.internalError = internalError;
        this.clientErrorMessage = clientErrorMessage;
    }

    public int getInternalError() {
        return internalError;
    }

    public String getClientErrorMessage() {
        return clientErrorMessage;
    }
    }


