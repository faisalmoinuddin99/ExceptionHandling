package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String a = "200";
        String  b = "100";

        try {
            System.out.println(a + b);
        }catch (Exception e ){
            System.out.println("String cannot be added");
        }
        finally {
            int a1 = convertStringToInt(a);
            int a2 = convertStringToInt(b);

            System.out.println(a1 + a2);

        }

    }

    public static int convertStringToInt(String number){
        int i = Integer.parseInt(number);
        return i;
    }

}
