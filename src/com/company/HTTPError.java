package com.company;

public enum HTTPError {
    ERROR_400(400,"Error 400","Bad Request"),
    ERROR_401(401,"Error 401","Unauthorized"),
    ERROR_402(402,"Error 402","Payment Required"),
    ERROR_403(403,"Error 403","Forbidden"),
    ERROR_404(404,"Error 404","Not Found");


    private int number;
    private String name;
    private String description;

    HTTPError(int number, String name, String description) {
        this.number = number;
        this.name = name;
        this.description = description;
    }

    HTTPError(){

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
