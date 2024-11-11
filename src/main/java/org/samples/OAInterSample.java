package org.samples;

public class OAInterSample {
    static Foo bar = new Foo();
    public static void conflict() {
        bar.x += 2;
        System.out.println(bar.x);
    }
}
