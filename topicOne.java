public class topicOne {
    public static void main(String[] args) {
         
        // variable and data types

        // q1

        String name = " jiya singh";
        int age = 20;
        double height = 5.2;
        char grade = 'A';

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Grade: " + grade);

        //q2
        int length = 10;
        int breadth = 5;
        int area = length * breadth;
        System.out.println("Area of rectangle: " + area);

        //q3
        String studentname = " jiya singh";
        int studentage = 20;
        double studentpercentage = 85.5;
        char studentgrade = 'A';
        boolean isPassed = true;

        System.out.println(studentname + " is " + studentage + "years old, scored " + studentpercentage + "got grade " + studentgrade + "and passes : " + isPassed);

        //q4
        int a = 10;
        int b = 20;

        a = b;
        b = 50;

        System.out.println(a);
        System.out.println(b);

        //q5
        int money = 5000;
        int onclothes = 1250;
        int ontravel = 400;
        int onfood = 800;

        int remainingmoney = money - (onclothes + ontravel + onfood);
        System.out.println("Remaining money: " + remainingmoney);


        // Arithmetic Operators

            // +   addition
            // -   subtraction
            // *   multiplication
            // /   division
            //  %  remainder

            int c = 17;
            int d = 5;

            System.out.println(c + d); // 22
            System.out.println(c - d); // 12
            System.out.println(c * d); // 85
            System.out.println(c / d); // 3
            System.out.println(c % d); // 2

        // Relational Operators
        // >     // greater than
        // <     // less than
        // >=    // greater than or equal
        // <=    // less than or equal
        // ==    // equal to
        // !=    // not equal to


        int e = 10;
        int f = 20;
        boolean isGreater = e > f;
        boolean isLess = e < f;
        boolean isGreaterOrEqual = e >= f;
        boolean isLessOrEqual = e <= f;
        boolean isEqual = e == f;
        boolean isNotEqual = e != f;    

        System.out.println("Is e greater than f? " + isGreater);
        System.out.println("Is e less than f? " + isLess);      
        System.out.println("Is e greater than or equal to f? " + isGreaterOrEqual);
        System.out.println("Is e less than or equal to f? " + isLessOrEqual);
        System.out.println("Is e equal to f? " + isEqual);
        System.out.println("Is e not equal to f? " + isNotEqual);


        int lifeage = 20;

        System.out.println(lifeage > 18);   // true
        System.out.println(lifeage == 20);  // true
        System.out.println(lifeage < 18);   // false
       
        // Logical Operators
        // &&   // AND
        // ||   // OR
        // !    // NOT

        int agee = 20;
        boolean hasID = true;

        System.out.println(agee >= 18 && hasID);


    // practice q1 - day 2
    int g = 25;
    int h = 4;
   
    System.out.println(g + h); // 29
    System.out.println(g - h); // 21
    System.out.println(g * h); // 100
    System.out.println(g / h); // 6
    System.out.println(g % h); // 1
   
    // practice q2 

    int maths = 85;
    int sst = 78;
    int java = 92;

    int totalMarks = maths + sst + java;
    double averageMarks = totalMarks / 3.0;

    System.out.println("Total Marks: " + totalMarks);
    System.out.println("Average Marks: " + averageMarks);

    // practice q3
    int i = 15;
    int j = 20;

    System.out.println(i > j);  // false
    System.out.println(i < j);  // true 
    System.out.println(i >= j); // false
    System.out.println(i <= j); // true

    // practice q4
    int ageee = 20;
    boolean hasLicense = true;

    System.out.println(ageee >= 18 && hasLicense); // true
     
    boolean haslicense = false;
    System.out.println(ageee >= 18 && haslicense); // false


    // Day 3 — if, else if, else


        // pactice q1
        int agge = 93;
        
        if (agge >= 18) {
            System.out.println("Adult");
        } else{
            System.out.println("Minor");
        }

        // practice q2

        int num = 15;
         
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }

        // practice q3

        int number = -5;

        if (number > 0) {
            System.out.println(number + " is positive");
        } else if (number < 0) {
            System.out.println(number + " is negative");
        } else {
            System.out.println(number + " is zero");
        }

        // practice q4

        int markss = 85;

        if (markss >= 90) {
            System.out.println("Grade: A");
        } else if (markss >= 80) {
            System.out.println("Grade: B");
        } else if (markss >= 70) {
            System.out.println("Grade: C");
        } else if (markss  >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        // practice q5

        int numberro = 7;
        int numberrt = 12;

        if (numberro > numberrt) {
            System.out.println(numberro + " is greater than " + numberrt);
        } else if (numberro < numberrt) {
            System.out.println(numberro + " is less than " + numberrt);
        } else {
            System.out.println(numberro + " is equal to " + numberrt);
        }

        // practice q6
        int attendancee = 82;
        boolean feesPaidd = true;

        if (attendancee >= 75 && feesPaidd) {
            System.out.println("Eligible to sit for the exam");
        } else {
            System.out.println("Not eligible to sit for the exam");
        }

        
}}


