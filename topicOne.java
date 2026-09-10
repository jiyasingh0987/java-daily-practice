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
    }
}

