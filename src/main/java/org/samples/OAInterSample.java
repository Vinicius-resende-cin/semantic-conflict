package org.samples;

public class OAInterSample {
    static Foo bar = new Foo();
    public static void conflict() {
        LeftAssignment.sum2(bar);
        System.out.println(bar.x);
    }
}
