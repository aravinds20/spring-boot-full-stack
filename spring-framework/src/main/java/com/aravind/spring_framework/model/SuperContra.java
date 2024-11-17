package com.aravind.spring_framework.model;

public class SuperContra implements Game {

    public void up(){
        System.out.println("jump");
    }
    public void down(){
        System.out.println("duck");
    }
    public void left(){
        System.out.println("move back");
    }
    public void right(){
        System.out.println("shoot");
    }
}
