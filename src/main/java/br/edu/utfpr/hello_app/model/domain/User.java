package br.edu.utfpr.hello_app.model.domain;

public class User {
    private String name;
    private int year;
    private int age;

    public User(){

    }

    public User(String name, int year, int age){
        this.name = name;
        this.year = year;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }
}
