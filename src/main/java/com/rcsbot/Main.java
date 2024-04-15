package com.rcsbot;

import com.google.rbm.RbmApiHelper;

public class Main {
    public static void main(String[] args) {
        RbmApiHelper rbmApiHelper = new RbmApiHelper();
        try {
            boolean capability= rbmApiHelper.getCapability(""); //add number
            System.out.println(capability);
            rbmApiHelper.registerTester(""); //add number
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}