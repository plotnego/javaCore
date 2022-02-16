package com.company;

public class WrapperShape <T extends Shape>{
    private T t;

    public WrapperShape(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
