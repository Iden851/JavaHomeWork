package com.pb.ivanov.hw5;

import java.util.Arrays;

public class Reader {
    private String name;
    private int passNum;
    private String faculty;
    private String bithDate;
    private String phone;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassNum() {
        return passNum;
    }

    public void setPassNum(int passNum) {
        this.passNum = passNum;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getBithDate() {
        return bithDate;
    }

    public void setBithDate(String bithDate) {
        this.bithDate = bithDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void takeBook(int books) {
        System.out.println(name + " взял " + books + " книги");
        }

    public void takeBook(String... books) {
        System.out.println(name + " взял книги: ");
        for (String book: books){
            System.out.println(book);
        }
    }
    public void takeBook(Object... books) {
        System.out.println(name + " взял книги: ");
        for (Object book: books){

            System.out.println(Arrays.asList(book));

        }
    }

    public void returnBook(int books) {
        System.out.println(name + " вернул " + books + " книги");
    }

    public void returnBook(String... books) {
        System.out.println(name + " вернул книги: ");
        for (String book: books){
            System.out.println(book);
        }
    }

    String getInfo() {
        return "[ФИО: " + name + ", номер читательского билета: " + passNum + ", " +
                "факультет: " + faculty + ", дата рождения: " + bithDate + ", телефон:" + phone + "]";
    }
}
