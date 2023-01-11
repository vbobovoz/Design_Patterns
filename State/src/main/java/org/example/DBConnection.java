package org.example;

public class DBConnection {
    private State curState;
    public DBConnection() {
        curState = new CloseState();
    }

    public void setCurState(State _state) {
        curState = _state;
    }

    public String info() {
        return curState.info();
    }
}
