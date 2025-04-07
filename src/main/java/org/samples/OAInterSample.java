package org.samples;

public class OAInterSample {
    static Foo bar = new Foo();
    public static void conflict() {
        System.out.println(bar.x);
    }
}
