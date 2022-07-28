package com.example.helloWorld.second_task;

public class Addition {

    private int data;

    public Addition(int data) {
        this.data = data;
    }

    public Addition() {
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Addition{" +
                "data=" + data +
                '}';
    }
}
