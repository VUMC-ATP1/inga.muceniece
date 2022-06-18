package classroom;

public class MyFirstJavaCode {
    public static void main(String[] args) {
        System.out.println("Hello World! My name is: Inga!");
        System.out.println("First arguments is: " + args[0]);
        System.out.println("Second arguments is: " + args[1]);

        byte floorCount = 7;
        byte[] floors = {1, 2, 3, 4, 5, 6, 7};  // masīvs
        System.out.println("My house consist of " + floorCount + " floors");
        System.out.printf("My house consist of %d floors\n", floorCount);

        short juniorTesterSalaryInEur = 1000;
        short salariesInIT[] = {1000, 2000, 3000};  //masīvs
        short emptySalariesArray[] = new short[4];
        emptySalariesArray[0] = 1000;
        emptySalariesArray[1] = 2000;
        emptySalariesArray[2] = 3000;
        emptySalariesArray[3] = 4000;
        System.out.println(emptySalariesArray[2]);

        System.out.println(juniorTesterSalaryInEur);
        System.out.printf("Average salary for Junior QA Engineer is: %d\n", juniorTesterSalaryInEur);

        int chinaPopulation = 1449687399;
        System.out.printf("China population %d people\n", chinaPopulation);

        long currentWorldPopulation = 794609700;
        System.out.printf("Current World population: %d\n", currentWorldPopulation);

        float myCurrentWeight = 64.8f;
        System.out.println(myCurrentWeight);

        double gasPriceInEur = 1.833445d;
        System.out.println(gasPriceInEur);

        boolean isSummer = true;
        if(isSummer){
            System.out.printf("Now is summer! And boolean value is %b\n", isSummer);
        } else {
            System.out.println("No, summer will be the next!");
        }

        char lastNameLetter = 'M';
        System.out.println(lastNameLetter);

        String myNameAndsSurname = "Inga Muceniece";
        System.out.println(myNameAndsSurname);

        System.out.println(7+7);
        System.out.println("7+7");
        System.out.println("7" + 7);

        int a =10;
        int b = 5;
        System.out.println(a + b);

        int c = a + b;
        System.out.println(c);

        boolean isAGraterThanB = a > b;
        System.out.printf("Is a is greater than b: %b",isAGraterThanB);


    }

}
