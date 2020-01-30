package com.week9Py;

import java.util.ArrayList;

public class Member {
    //fields
    private ArrayList<PhysicalBook> book;
    private ArrayList<String> message;
    private String name;
    private String rank;

    //Constructor
    public Member() {
        name = "";
        rank = "";
    }

    //Methods
    public void setName(String n) {
        name = n;
    }

    public void setRank(String r) {
        rank = r;
    }

    public String getName() {
        return name;
    }

    public String getRank() {
        return rank;
    }


    public void add(PhysicalBook b) {
        book.add(b);
    }

    public void remove(PhysicalBook b) {
        book.remove(b);
    }

    public void printBook() {
        if (book.size() == 0) {
            System.out.println("The list is empty");
        } else {
            System.out.println("Books are listed:");
            System.out.println("=================");
            for (int i = 0; i < book.size(); i++) {
                System.out.println(book.get(i).getDetails());
            }
            System.out.println("=================");
        }
    }

    public int numberOfBooks() {
        return book.size();
    }

    public void addMessages(String m) {
        message.add(m);
    }
}


