package edu.htc.blitstein;

public class HelloWorld {
    public static void main(String... args){
        String name = "Bob";
        if (args.length > 0) {
            name = args[0];
        }
        System.out.println("Hello, world");
    }

}
