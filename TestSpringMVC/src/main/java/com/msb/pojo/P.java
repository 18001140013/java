package com.msb.pojo;

public class P {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "P{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
