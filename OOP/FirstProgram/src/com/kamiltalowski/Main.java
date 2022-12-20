package com.kamiltalowski;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        /*//hello world ***********************************************
        System.out.println("\"Hello World\"\n");
        System.out.println("I love pizza");


        //comment
        *//*
            comment
            la
            la
         */

       /* //variables *************************************************
        int x; //declaration
        x=123; //assigment
        int y = 123;//initialization
        long z = 123143431412L;
        byte m = 100;
        double k = 3.13156;
        float l = 3.14F;
        boolean n = true;
        char symbol= '@';
        String name1 ="Kamil";

        System.out.println("my number is " + x + "\n" +"my name is " + name1
        );*/

       /* //swap *****************************************************
        String name2 = "Adam";
        String buffer = "";
        buffer=name1;
        name1=name2;
        name2=buffer;
        System.out.println(name1+"\n"+name2);*/

        /*//user input ***********************************************
        Scanner scanner = new Scanner(System.in);
        System.out.println("Whats is your name");
        String name = scanner.nextLine();
        System.out.println("How old are you?");
        int age = scanner.nextInt();//doesn't read \n
        scanner.nextLine(); //to clear \n in scanner
        System.out.println("Whats is your fav food");
        String food = scanner.nextLine();

        System.out.println("Hello "+name);
        System.out.println("You are "+ age+" years old");
        System.out.println("Your fav food is  "+food);*/

        /*//expression == operands% operators *****************************
        //operators= values, variables,numbers,quantity
        //operators= + - * / %

        double friends = 10;
        //friends = friends +3;
        //friends = friends -3;
        friends = (double)friends /3; //"casting"
        //friends = friends *3;
        //friends = friends %3;

        System.out.println(friends);*/

        /*//GUI swing JoptionPane *************************************
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null,"Helllo "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null,"You are "+age+ " years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null,"You are "+height+ " cm tall");*/

        //Math *******************************************************
        //double x = 3.14;
        //double y = 10;
        //Math .min ,max. abs .sqrt .round .ceil .floor

        //double z =Math.sqrt(Math.pow(x, 2)+ Math.pow(y, 2)) ;
        //System.out.println(z);
        /*double x;
        double y;

        Scanner scanner= new Scanner(System.in);

        System.out.println("podaj x ");
        x = scanner.nextDouble();
        System.out.println("podaj y ");
        y = scanner.nextDouble();

        double z =Math.sqrt(Math.pow(x, 2)+ Math.pow(y, 2)) ;
        System.out.println(z);

        scanner.close();*/

        //Random ***********************************************

        /*Random random = new Random();

        *//*int x = random.nextInt(6)+1;
        System.out.println(x);*//*
        *//*double y = random.nextDouble();
        System.out.println(y);*//*
        boolean z = random.nextBoolean();
        System.out.println(z);*/

        //if ****************************************************
        /*int age = 12;

        if(age>=75){
            System.out.println("ok boomer");
        }else if(age>=18){
            System.out.println("you are an adult");
        }else if(age>=13){
            System.out.println("you are a teenager");
        }else if(age==12){
            System.out.println("you'll be teenager next year");
        }
        else{
            System.out.println("You are not an adult!");
        }*/

        //Switch *************************************************

        /*String day="Friday";
        switch(day){
            case "Sunday": System.out.println("It is sunday");
            break;
            case "Monday": System.out.println("It is monday");
            break;
            case "Tuesday": System.out.println("It is tuesday");
            break;
            case "Wednesday": System.out.println("It is wednesday");
            break;
            case "Thursday": System.out.println("It is thursday");
            break;
            case "Friday": System.out.println("It is friday");
            break;
            case "Saturday": System.out.println("It is saturday");
            break;
            default: System.out.println("That is not a day");*/

        //Logical Operators ***************************************
        // && =AND
        // || =OR
        // ! =NOT

        /*//AND
        int temp =15;

        if(temp>30){
            System.out.println("It is so hot");
        }
        else if(temp>=20 && temp<=30){
            System.out.println("It is warm");
        }else {
            System.out.println("It is cold");
        }
        //OR
        Scanner scanner = new Scanner((System.in));
        System.out.println("It is a new game1! Press q or Q to quit");
        String response = scanner.next();

        if(response.equals("q") || response.equals("Q")){
            System.out.println("you quit the game");
        }else{
            System.out.println("U are still playing");
        }
        //NOT
        System.out.println("It is new a game2! Press q or Q to quit");
        String input = scanner.next();

        if(!input.equals("q") && !input.equals("Q")){
            System.out.println("you are still playing");
        }else{
            System.out.println("U quit a game");
        }*/

        //While loop ***************************************************

        /*Scanner scanner = new Scanner(System.in);
        String name ="";

        while(name.isBlank()){
            System.out.println("enter your name");
            name = scanner.nextLine();

            if(name.isBlank()){
                System.out.println("imie nie moze byc puste");
            }
        }
        System.out.println("hello " + name);

        //do while
        do{
            System.out.println("enter your name");
            name = scanner.nextLine();

        }while(name.isBlank());
        System.out.println("hello " + name);*/

        //For loop ********************************************

        /*
        for(int i=10; i>=0; i--){
            System.out.println(i);
        }
        System.out.println("heppy new year");*/

        //Nested Loops ****************************************
        /*Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        String symbol = "";

        System.out.println("Lets make rectangle");
        System.out.println("Enter number or rows: ");
        rows = scanner.nextInt();
        System.out.println("Enter number or columns: ");
        columns = scanner.nextInt();
        System.out.println("Enter symbol to use: ");
        symbol = scanner.next();

        for(int i= 1; i<= rows; i++){
            for(int j= 1; j<= columns; j++){
                System.out.print(symbol);
            }
            System.out.println();
        }*/

        //Array *******************************************
        /*String[] cars1 = {"Camaro", "Corvette", "Tesla"}; //initialized

        cars1[0]= "Mustang";

        System.out.println(cars1[2] +"\n");

        //2nd way

        String[] cars2= new String[3];

        cars2[0]="Camaro";
        cars2[1]="Corvette";
        cars2[2]="Tesla";
        for( int i=0; i< cars2.length; i++){
            System.out.println(cars2[i]);
        }*/

        //2D Array *******************************************

        /*String[][] cars1 = new String[3][3];
        cars1[0][0]= "Camaro";
        cars1[0][1]= "Tesla";
        cars1[0][2]= "Volvo";
        cars1[1][0]= "Corvette";
        cars1[1][1]= "Seat";
        cars1[1][2]= "Fiat";
        cars1[2][0]= "Opel";
        cars1[2][1]= "Ford";
        cars1[2][2]= "Skoda";

        for(int i=0; i<cars1.length;i++){
            System.out.println();
            for(int j=0; j<cars1[i].length; j++){
                System.out.print(cars1[i][j]+" ");
            }
        }

        String[][] cars2 =  {{"Camaro","Tesla","Volvo"},
                             {"Corvette","Seat","Fiat"},
                             {"Opel","Ford","Skoda"}};

        for(int i=0; i<cars2.length;i++) {
            System.out.println();
            for (int j = 0; j < cars2[i].length; j++) {
                System.out.print(cars2[i][j] + " ");
            }
        }*/

        //String methods **************************************

        /*String name = "Kamil   ";

        //boolean result = name.equals("Kamil");
        //int result = name.length();
        //char result = name.charAt(0);
        //int result = name.indexOf("K");
        //boolean result= name.isEmpty();
        //String result = name.toUpperCase();
        //String result = name.toLowerCase();
        //String result= name.trim();
        //String result = name.replace('a', 'o');

        System.out.println(result);*/

        //wrapper class = provides a way to use primitives data types as reference data types
        //                  reference data types contain useful methods
        //                  can be used with collections (ex. ArrayList)

        // primitive    //wrapper
        //
        //boolean       Boolean
        //char          Character
        //int           Integer
        //double        Double

        //autoboxing = automatic conversion that Java compiler makes between the primitive data types and their corresponding wrapper classes
        //unboxing = the reverse of autoboxing. Wrapper -> primitive

        //autoboxing
        /*Boolean a = true;
        Character b= '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Kamil";

        //unboxing
        if(a==true){
            System.out.println("this is true");
        }
        if(b=='@'){
            System.out.println("this is true");
        }*/

        //Array List ***********************************************

        //ArrayList = resizable array, adding/deleting new elements, store reference data types

        /*ArrayList<String> food = new ArrayList<String>();

        food.add("pizza");
        food.add("hemburg");
        food.add("hotdg");

        food.set(0, "sushi");
        food.remove(2);
        //food.clear();

        for(int i=0; i<food.size(); i++){
            System.out.println(food.get(i));
        }*/

        //2D ArrayList ************************************************
        /*ArrayList<ArrayList<String>> groceryList = new ArrayList<>();
        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        ArrayList<String> produceList = new ArrayList();
        produceList.add("tomatoes");
        produceList.add("zuuchini");
        produceList.add("peppers");

        ArrayList<String> drinksList = new ArrayList();
        drinksList.add("soda");
        drinksList.add("coffee");

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);


        System.out.println(groceryList);

        System.out.println(groceryList.get(0));

        System.out.println(groceryList.get(0).get(0));
        System.out.println(groceryList.get(2).get(1));
*/

        //for-each *************************************************
        //iterates through the elements in an array/collection
        //less steps, more readable
        //less flexible

        //String[] animals = {"cat", "dog","rat","bird"};
        /*ArrayList<String> animals = new ArrayList<String>();
        animals.add("cat");
        animals.add("dog");
        animals.add("rat");
        animals.add("bird");

        for(String i :animals){
            System.out.println(i);
        }
        }*/

         //Methods ******************************************************
        //code executet when is called upon
        /*String name = "Kamil";
        int age = 26;
        hello(name, age);

        int x=3,y=4;
        System.out.println(add(x,y));*/

        //Overloaded methods *********************************************
        // same name different parameters witch its signature
        /*int x= add(1,2);
        System.out.println(x);
        x= add(1,2,3);
        System.out.println(x);
        x= add(1,2,3,4);
        System.out.println(x);

        double y= add(1.1,2.2);
        System.out.println(y);
        y= add(1.1,2.2,3.3);
        System.out.println(y);
        y= add(1.1,2.2,3.3,4.4);
        System.out.println(y);*/

        //printf****************************************************
        //  control format and display text in console window
        //  %[flags] [precision]  [width] [conversion-character]

        /*//[conversion-character]
        boolean myBoolean = true;   //%b
        char myChar='@';            //%c
        String myString="Kamil";    //%s
        int myInt= 50;              //%d
        double myDouble= 3000.14;      //%f (and floats)

        System.out.printf("This is format string %d \n",myInt);
        //[width]
        System.out.printf("Hello %10s \n", myString);
        //[precision]
        //sets number of digits of precision for double and float
        System.out.printf("Your money %.3f \n", myDouble);
        //[flags]
        //- left justify
        //+ outputs sign +-
        //0 numbers are zero-padded
        //, coma grouping separator >1000
        System.out.printf("Your money %-5f \n", myDouble);
        System.out.printf("Your money %+f \n", myDouble);
        System.out.printf("Your money %020f \n", myDouble);
        System.out.printf("Your money %,f \n", myDouble);
        */

        //final ********************************************************
        /*final double PI= 3.14159; //cant update PI final= uppercase
        System.out.println(PI);*/


    }
    //Methods ******************************************************
    /*static void hello(String name, int age){
        System.out.println("hello "+ name+ " age "+age);
    }
    static int add(int x, int y){
        return x+y;
    }*/

    //Overloaded methods *********************************************
    /*static  int add(int a, int b){
        System.out.println("This is overloaded methot #1");
        return a+b;
    }
    static  int add(int a, int b, int c){
        System.out.println("This is overloaded methot #2");
        return a+b+c;
    }
    static  int add(int a, int b, int c, int d){
        System.out.println("This is overloaded methot #3");
        return a+b+c+d;
    }
    static  double add(double a, double b){
        System.out.println("This is overloaded methot #4");
        return a+b;
    }
    static  double add(double a, double b, double c){
        System.out.println("This is overloaded methot #5");
        return a+b+c;
    }
    static  double add(double a, double b, double c, double d){
        System.out.println("This is overloaded methot #6");
        return a+b+c+d;
    }*/
}