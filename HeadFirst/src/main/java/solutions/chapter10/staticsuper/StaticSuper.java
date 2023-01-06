package main.java.solutions.chapter10.staticsuper;

public class StaticSuper {

    static {
        System.out.println("Super static block!");
    }

    public StaticSuper() {
        System.out.println("Super constructor!");
    }
}
