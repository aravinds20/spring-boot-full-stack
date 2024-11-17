package com.aravind.spring_framework.model;

public class SuperMario implements Game {

    public void up(){
        System.out.println("step up");
    }
    public void down(){
        System.out.println("crawl");
    }
    public void left(){
        System.out.println("move back");
    }
    public void right(){
        System.out.println("run");
    }

}
