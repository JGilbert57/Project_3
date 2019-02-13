package com.killoran.Week1;

/**
 * Created by 111618 on 2/12/2019.
 */
public class Book {
    private String Name;
    private String Email;

    public Book(String name, String email) {
        Name = name;
        Email = email;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return
                Name + " : " + Email;
    }
}
