package com.theara.java.modularity.easytext;

public class Main {

    public static void main(String[] args) {
        if (args.length < 1){
            System.out.println("Welcome to EasyText. Please provide some text for us. Thank you!");
            return;
        }

        System.out.println("Flesch-Kincaid : " + analyze(args[0]));
    }

    private static double analyze(String statement){
        // TODO : dumy code
        return ((double) statement.length()) / 100;
    }

}
