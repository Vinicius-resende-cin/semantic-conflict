package org.samples;

public class CFSimple {
    public void conflict() {
        int x = 0;
        int y = 0;
        int z = x + y;
        System.out.println(z);
    }
}
