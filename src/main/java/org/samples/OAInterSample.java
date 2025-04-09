package org.samples;

public class OAInterSample {
    static Foo bar = new Foo();

    public static void conflict() {
        OAInterSample.subConflict(bar);
        System.out.println(bar.x);
    }

    public static void subConflict(Foo bar) {
        System.out.println(bar.x);
    }
}
