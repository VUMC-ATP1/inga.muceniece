package homework;

import java.sql.SQLOutput;

public class FirstClassJava {
    public static void main(String[] args) {


        String country = "Lesotho";
        System.out.println("A litle bit of " + country);

        System.out.println("---------------------------------");

        double area = 30.355;
        System.out.println("Area: " + area + " km2");

        long population = 1795000;
        System.out.printf("Population: %d\n", population);

        String capitalCity = "Maseru";
        System.out.println("Capital city: " + capitalCity);

        String language1 = "Sesotho";
        String language2 = "English";
        System.out.println("Official language: " + language1 + " and " + language2);

        char currency = 'L';
        System.out.println("Currency: " + currency);

        boolean eurUnion = false;
        if(eurUnion){
            System.out.printf("Lesotho is member of the EU: %b\n", eurUnion);
        } else {
            System.out.println("Lesotho is not a member of the EU");
        }

        System.out.println("");

        System.out.println("Pa trīs piemēriem uz katru aritmētisko operatoru.");
        int a =6;
        int b = 3;
        int c = a + b;
        int d = a - b;
        int e = a * b;
        int f = a / b;

        System.out.println(6+3);
        System.out.println(a + b);
        System.out.println(c);

        System.out.println(6-3);
        System.out.println(a - b);
        System.out.println(d);

        System.out.println(6*3);
        System.out.println(a * b);
        System.out.println(e);

        System.out.println(6/3);
        System.out.println(a / b);
        System.out.println(f);
    }
}
