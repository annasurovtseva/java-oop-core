package ru.geekbrains.java.oop.core.example2;

public interface Action {

    String getInfo();
    String getName();
    boolean toRun(float length);
    boolean toJump(float height);
}
