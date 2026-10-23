package com.msb.pojo;

public class Girl {
    private String name;
    private int age;
    private Boy boyFriend;

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

    public Boy getBoyFriend() {
        return boyFriend;
    }

    public void setBoyFriend(Boy boyFriend) {
        this.boyFriend = boyFriend;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "名字='" + name + '\'' +
                ", 年龄=" + age +
                ", 男朋友=" + boyFriend +
                '}';
    }
}
