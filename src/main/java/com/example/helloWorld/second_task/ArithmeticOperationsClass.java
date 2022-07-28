package com.example.helloWorld.second_task;

public class ArithmeticOperationsClass {

    private int data;

    public ArithmeticOperationsClass(int data) {
        this.data = data;
    }

    public ArithmeticOperationsClass() {
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
