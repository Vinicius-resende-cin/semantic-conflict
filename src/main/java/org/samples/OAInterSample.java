package org.samples;

public class OAInterSample {
    static Foo bar = new Foo();

    public static void conflict() {
        OAInterSample.subConflict(bar);
        System.out.println(bar.x);
        RightAssignment.sub1(bar);
    }

    public static void subConflict(Foo bar) {
        LeftAssignment.sum2(bar);
    }
}
