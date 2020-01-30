package com.week9Py;

import java.util.ArrayList;

public class PhysicalBook extends Resource{

    //fields
    private Member member;
    private ArrayList<String> damage;

    //Constructor
    PhysicalBook() {
        member = null;
    }

    //Methods

    void setMember(Member m) {
        this.member = m;
    }

    void addDamage(String d) {
        this.damage.add(d);
    }


    Member getMember() {
        return member;
    }

    public ArrayList getDamage() {
        return damage;
    }

    public String getDetails() {
        return super.getAuthor() + ", " + super.getTitle();
    }

    boolean checkAvailability() {
        boolean a = true;
        a = member == null;
        return a;
    }

    public void printDetails() {
        System.out.println("Title: " + super.getTitle());
        System.out.println("Author :" + super.getAuthor());
        System.out.println("ISBN number: " + super.getIsbn());
        if (member == null) {
            System.out.println("The book is available");
        } else {
            System.out.println("The book is not available.");
        }
        if (damage.size() == 0) {
            System.out.println("No damage record found");
        } else {
            System.out.println("The damages recorded are listed:");
            System.out.println("================================");
            for (String s : damage) {
                System.out.println(s);
            }
            System.out.println("================================");
        }
    }
}
