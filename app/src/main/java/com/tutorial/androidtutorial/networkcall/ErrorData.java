package com.tutorial.androidtutorial.networkcall;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ErrorData {
    @SerializedName("statusCode")
    @Expose
    private Double statusCode;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("error")
    @Expose
    private ErrorData error;
    @SerializedName("validationErr")
    @Expose
    private List<ValidationErr> validationErr;

    public Double getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Double statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ErrorData getError() {
        return error;
    }

    public void setError(ErrorData error) {
        this.error = error;
    }

    public List<ValidationErr> getValidationErr() {
        return validationErr;
    }

    public void setValidationErr(List<ValidationErr> validationErr) {
        this.validationErr = validationErr;
    }
    public class ErrorMessage {


        @SerializedName("message")
        @Expose
        private String message;
        @SerializedName("code")
        @Expose
        private String code;
        @SerializedName("time")
        @Expose
        private String time;
        @SerializedName("requestId")
        @Expose
        private String requestId;
        @SerializedName("statusCode")
        @Expose
        private Integer statusCode;
        @SerializedName("retryable")
        @Expose
        private Boolean retryable;
        @SerializedName("retryDelay")
        @Expose
        private Double retryDelay;

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getRequestId() {
            return requestId;
        }

        public void setRequestId(String requestId) {
            this.requestId = requestId;
        }

        public Integer getStatusCode() {
            return statusCode;
        }

        public void setStatusCode(Integer statusCode) {
            this.statusCode = statusCode;
        }

        public Boolean getRetryable() {
            return retryable;
        }

        public void setRetryable(Boolean retryable) {
            this.retryable = retryable;
        }

        public Double getRetryDelay() {
            return retryDelay;
        }

        public void setRetryDelay(Double retryDelay) {
            this.retryDelay = retryDelay;
        }

    }

}


