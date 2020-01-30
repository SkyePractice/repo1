package com.week9Py;

import java.util.ArrayList;

public class Library {

    //fields
    private ArrayList<PhysicalBook> books;
    private ArrayList<EResouece> eResoueces;
    private ArrayList<Resource> catalogue;
    private String name;
    private String location;

    //constructor
    public Library() {
        catalogue = new ArrayList<Resource>();
    }

    public void addBookCatalogue(PhysicalBook b) {
        books.add(b);
    }

    public void addEResourceCatalogue(EResouece e) {
        eResoueces.add(e);
    }

    public void addToCatalogue(Resource x) {
        catalogue.add(x);
    }

    public void setName(String n) {
        name = n;
    }

    public void setLocation(String l) {
        location = l;
    }

    public void printBookCatalogue() {
        if (books.size() == 0) {
            System.out.println("The book catalogue is empty");
        } else {
            System.out.println("The book catalogue contains " + books.size() + " books as listed:");
            System.out.println("=================================================================");
            for(int i = 0; i < books.size(); i++) {
                System.out.println(books.get(i).getDetails());
                System.out.println("=================================================================");
            }
        }
    }

    public void printEResourceCatalogue() {
        if (eResoueces.size() == 0) {
            System.out.println("The e-resource catalogue is empty");
        } else {
            System.out.println("The e=resource catalogue contains " + eResoueces.size() + " e-resources as listed:");
            System.out.println("==================================================================================");
            for(int i = 0; i < eResoueces.size(); i++) {
                System.out.println(eResoueces.get(i).getDetails());
                System.out.println("==================================================================================");
            }
        }
    }

    public void printCatalogue() {
        if (catalogue.size() == 0) {
            System.out.println("The catalogue is empty");
        } else {
            System.out.println("The catalogue contains " + catalogue.size() + " resources as listed:");
            System.out.println("==================================================================================");
            for(int i = 0; i < catalogue.size(); i++) {
                if (catalogue.get(i) instanceof PhysicalBook) {
                    System.out.println(((PhysicalBook) catalogue.get(i)).getDetails());
                } else {
                    if (catalogue.get(i) instanceof EResouece) {
                        System.out.println(((EResouece) catalogue.get(i)).getDetails());
                    }
                }
            }
                System.out.println("==================================================================================");

        }
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public void printDetails() {
        System.out.println("Library name: " + name);
        System.out.println("Library location : " + location);
        printBookCatalogue();
        printEResourceCatalogue();
    }

    public void checkBookCatalogue(PhysicalBook b) {
        if (books.contains(b)) {
            System.out.println("The book is available in the catalogue");
        } else {
            System.out.println("The book is not available in the catalogue");
        }
    }

    public void checkEResourceCatalogue(EResouece e) {
        if (eResoueces.contains(e)) {
            System.out.println("The e-resource is available in the catalogue");
        } else {
            System.out.println("The e-resource is not available in the catalogue");
        }
    }

    public void changeBookTitle(PhysicalBook b, String t) {
        if (books.contains(b)) {
            b.setTitle(t);
        } else {
            System.out.println("The book is not in the catalogue.");
        }
    }

    public void changeEResourceTitle(EResouece e, String t) {
        if (eResoueces.contains(e)) {
            e.setTitle(t);
        } else {
            System.out.println("The e-resource is not in the catalogue");
        }
    }

    public PhysicalBook searchBook(PhysicalBook b) {
        if (books.contains(b)) {
            return b;
        } else {
            return null;
        }
    }

    public EResouece searchEResource(EResouece e) {
        if (eResoueces.contains(e)) {
            return e;
        } else {
            return null;
        }
    }

    public void searchIsbn(String i) {
        int a = 0;
        try {
            while (a < books.size()) {
                if (books.get(a).getIsbn() == i) {
                    System.out.println("The book is found:");
                    System.out.println(books.get(a).getDetails());
                }
                a++;
            }
        } catch (Exception e) {
            a = 0;
            while (a < eResoueces.size()) {
                if (eResoueces.get(a).getIsbn().equals(i.trim())) {
                    System.out.println("The e-resource is found:");
                    System.out.println(eResoueces.get(a).getDetails());
                } else {
                    System.out.println("The resource is not found.");
                a++;
                }
            }

        }
    }

    public void searchAuthor(String a) {
        int i = 0;
        try {
            while (i < books.size()) {
                if (books.get(i).getAuthor().toLowerCase().equals(a.trim().toLowerCase())) {
                    System.out.println("The book is found:");
                    System.out.println(books.get(i).getDetails());
                }
                i++;
            }
        } catch (Exception e) {
            i = 0;
            while (i < eResoueces.size()) {
                if(eResoueces.get(i).getAuthor().toLowerCase().equals(a.trim().toLowerCase())) {
                    System.out.println("The e-resource is found:");
                    System.out.println(eResoueces.get(i).getDetails());
                }
                i++;
            }
        }
    }

    public void removeBook(PhysicalBook b) {
        if (books.contains(b)) {
            books.remove(b);
        } else {
            System.out.println("The book is not in the catalouge.");
        }
    }

    public void removeEResource(EResouece e) {
        if (eResoueces.contains(e)) {
            eResoueces.remove(e);
        } else {
            System.out.println("The e-resource is not in the catalogue.");
        }
    }

    public void removeBookPosition(int i) {
        books.remove(i);
    }

    public void removeEResourcePosition(int i) {
        eResoueces.remove(i);
    }

    public void booksAvailable() {
        System.out.println("Available books are listed:");
        System.out.println("===========================");
        for (PhysicalBook x : books) {
            if (x.checkAvailability()) {
                System.out.println(x.getDetails());
            }
        }
        System.out.println("===========================");
    }

    public int noOfResources() {
        return books.size() + eResoueces.size();
    }

    public void addBook(PhysicalBook b) {
        if (books.contains(b)) {
            System.out.println("The book is already in the catalogue");
        } else {
            books.add(b);
        }
    }

    public void addEResource(EResouece e) {
        if (eResoueces.contains(e)) {
            System.out.println("The EResource is already in the catalogue");
        } else {
            eResoueces.add(e);
        }
    }

    public void lendBook(PhysicalBook b, Member m) {
        if (!books.contains(b)) {
            System.out.println("The book is not in the catalogue");
        } else {
            if (!b.checkAvailability()) {
                System.out.println("The book is currently borrowed by another member.");
            } else {
                if (m.numberOfBooks() >= 5) {
                    System.out.println("One member can not borrow more than 5 books at once.");
                } else {
                    b.setMember(m);
                    m.add(b);
                    m.addMessages(b.getTitle() + " is borrowed.");
                }
            }
        }
    }

    public void acceptBook(PhysicalBook b, boolean dam, String des) {
        if (!books.contains(b)) {
            System.out.println("The book is not in the catalogue.");
        } else {
            b.getMember().addMessages(b.getTitle() + " is returned");
            b.setMember(null);
            b.getMember().remove(b);
            if (dam) {
                b.addDamage(des);
            }
        }
    }

    public void sendMessages(String m) {
        for (PhysicalBook x : books) {
            x.getMember().addMessages("Library message: " + m);
        }
    }

    public void printBookDetails() {
        System.out.println("The books in the catalogue are listed:");
        for(int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i).getDetails());
        }
    }

    public void printEREsourceDetails() {
        System.out.println("E-resources inthe catalogue are listed:");
        for (int i = 0; i < eResoueces.size(); i++) {
            System.out.println(eResoueces.get(i).getDetails());
        }
    }
}


