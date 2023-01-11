package org.example;

public class Context {
    private Strategy strategy;

    public Context(Strategy _strategy) {
        strategy = _strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
