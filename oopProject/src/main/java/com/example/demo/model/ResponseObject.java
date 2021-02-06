package com.example.demo.model;

public class ResponseObject {
    private Object object;
    private int status;
    public ResponseObject(Object object, int status){
        this.object = object;
        this.status = status;
    }

    public Object getObject() {
        return this.object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}

