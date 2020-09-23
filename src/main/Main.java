package main;

import reverser.ReverserStack;


public class Main {
    public static void main(String[] args) {
        System.out.println("Ban dau: ");
        String input = "Chuoi cac ky tu dao nguoc";
        System.out.println(input);
        String output;
        ReverserStack theReverser = new ReverserStack(input);
        output = theReverser.doRev();
        System.out.println("Reverser" + output);

    }
}
