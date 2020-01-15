package com.company;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your data::");
        String input = in.nextLine();

        MessageDigest md = MessageDigest.getInstance("SHA-256") ;
        md.update(input.getBytes());

        byte[] digest = md.digest();

        StringBuffer sb = new StringBuffer();

        for(byte b : digest){
            sb.append(String.format("%02x",b & 0xff));
        }

        System.out.println("SHA-256 HASH = " + sb.toString());
    }
}
