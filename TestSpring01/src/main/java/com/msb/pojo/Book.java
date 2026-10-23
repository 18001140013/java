package com.msb.pojo;

public class Book {

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        System.out.println("Book 设置参数id:" + id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Book 设置参数name:" + name);
    }

    public Book(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("Book 有参造函数===" + "id:" + id + " name:" + name);
    }

    public Book() {
        System.out.println("Book 空构造函数");
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
