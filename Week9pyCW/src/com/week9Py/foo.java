package com.week9Py;

public class foo {

    public static void main(String args[]) {
        PhysicalBook p1 = new PhysicalBook();
        p1.setTitle("Tutuanamaynlar");
        p1.setAuthor("Oguz Atay");
        p1.setIsbn("123123123");
        PhysicalBook p2 = new PhysicalBook();
        p2.setTitle("dokuzuncu hariciye kogusu");
        p2.setAuthor("peyami safa");
        p2.setIsbn("6894575487853");
        EResouece e1 = new EResouece();
        e1.setTitle("lalalala");
        e1.setAuthor("zabazbabzbaba");
        e1.setIsbn("321543865");
        Library l1 = new Library();
        ArrayListStack a = new ArrayListStack();
        a.add(p1);
        a.add(e1);
        System.out.println(a.size());
    }

}

