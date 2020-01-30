package com.week9Py;

import java.util.ArrayList;
import java.util.Random;

public class dsfhgfdgsa {

    private ArrayList<String> asd;
    private int i;
    private int j;
    private Random random;

    public dsfhgfdgsa() {
        asd = new ArrayList<String>();
        random = new Random();
    }

    public void asdsad() {
        asd.add("aaaa");
        asd.add("bbbb");
        asd.add("cccc");
        asd.add("dddd");
        asd.add("eeee");
    }

    public void SA() {
        for (String a : asd) {
            if (a.equals("eee")) {
                System.out.println("eeee");
            }
        }
    }

    public void aaa() {
        i = random.nextInt(5);
        j = random.nextInt(5);
        if ((i == 1 && j != 0) || (i == 1 && j != 4) || (i == 2 && j != 0) || (i == 2 && j != 4) ||
                (i == 3 && j != 0) || (i == 3 && j != 4)) {
            System.out.println("====");
        } else {
            System.out.println(i + ", " + j);
        }
    }



    public static void main(String[] args) {
        dsfhgfdgsa a = new dsfhgfdgsa();
        a.asdsad();
        a.SA();
        a.aaa();
    }
}
