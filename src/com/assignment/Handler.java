package com.assignment;

public interface Handler {
    void setNext(Handler handler);

    void handle(Issue file);

    String getName();
}
