package com.company;

import java.util.Scanner;

public class ROTCipher {
    private String in;
    private int num;
    private String out;
    private String guess;
    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    ROTCipher(String in,int num){
        this.in = in;
        this.num = num;
        encrypt();
        finish();
        return;
    }

    ROTCipher(String in,int num, String guess){
        this.in = in;
        this.num = num;
        this.guess = guess;
        encrypt();
        guess();
        finish();
        return;
    }

    public String encrypt(){
        String temp = "";
        for (int i=0;i<in.length(); ++i){
            char a = ((char) (in.charAt(i)+num));
            if (a > 'z')
                temp += (char)(in.charAt(i)-(26-num));
            else
                temp += ((char) (in.charAt(i)+num));


        }
        out = temp;
        return out;

    }
    public Boolean guess(){
        if (guess.equals(in)){
            System.out.println("You guessed correct!");
            return true;
        }
        else{
            System.out.println("Sorry you guessed wrong, Better luck next time");
            return false;
        }

    }

    public void finish(){
        System.out.println("Plain Text: "+ in);
        System.out.println("Key: " + num);
        System.out.println("Encrypted: " +out);
    }

}
