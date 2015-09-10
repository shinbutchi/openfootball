package com.shin.spring.openfootball.model.response;

import com.shin.spring.openfootball.constant.AppConstant;

/**
 * Created by shin on 9/11/2015.
 */
public class ApiResponse<T> {
    private String status;
    private String messageCode;
    private String messageInfo;
    private T body;

    public ApiResponse() {
        status = AppConstant.OPEN_FOOTBALL_RESPONSE_STATUS_OK;
    }

    public ApiResponse(T body) {
        this.body = body;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessageCode() {
        return messageCode;
    }

    public void setMessageCode(String messageCode) {
        this.messageCode = messageCode;
    }

    public String getMessageInfo() {
        return messageInfo;
    }

    public void setMessageInfo(String messageInfo) {
        this.messageInfo = messageInfo;
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }
}
