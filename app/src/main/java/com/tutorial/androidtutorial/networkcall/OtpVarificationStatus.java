package com.tutorial.androidtutorial.networkcall;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OtpVarificationStatus {

    @SerializedName("statusCode")
        @Expose
        private Double statusCode;
        @SerializedName("status")
        @Expose
        private String status;
        @SerializedName("message")
        @Expose
        private String message;

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


}