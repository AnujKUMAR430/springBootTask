package com.example.helloWorld.second_task;

public class ArithmeticOperations {

    private int data;

    public ArithmeticOperations(int data) {
        this.data = data;
    }

    public ArithmeticOperations() {
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
