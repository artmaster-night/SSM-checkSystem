package com.master.util;


/**
 * @author artmaster
 */
public class OneResponse {
    String message;
    Boolean flag;

    @Override
    public String toString() {
        return "OneResponse{" +
                "message='" + message + '\'' +
                ", flag=" + flag +
                '}';
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }
}
