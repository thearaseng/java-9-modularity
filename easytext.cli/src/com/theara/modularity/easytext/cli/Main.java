package com.theara.modularity.easytext.cli;

import com.theara.modularity.easytext.analysis.FlechKincaid;

public class Main {

    public static void main(String[] args) {
        if (args.length < 1){
            System.out.println("Welcome to EasyText. Please provide some text for us. Thank you!");
            return;
        }

        System.out.println("Flesch-Kincaid : " + new FlechKincaid().analyze(args[0]));
    }

}
