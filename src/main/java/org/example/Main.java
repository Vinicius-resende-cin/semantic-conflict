package org.example;

import samples.*;

public class Main {
    public static void main(String[] args) {
        DFPBaseSample dfpBaseSample = new DFPBaseSample();
        dfpBaseSample.setText("Hello  World");
        dfpBaseSample.cleanText();
        System.out.println(dfpBaseSample.getText());
    }
}