package com.company;

import javax.print.DocFlavor;
import java.awt.font.FontRenderContext;

public class vigenereCipher {
    private String in;
    private String key;
    private String out;
    private String guess;
    private String alphabet = "abcdefghijklmnopqrstuvwxyz";
    vigenereCipher(String in, String key){
        this.in=in;
        this.key=key;
        if (in.length() != key.length()){
            System.out.println("Please enter a correct key");
        }
        else {
            encrypt();
            finish();
           // table();
        }
        return;
    }

    vigenereCipher(String in, String key, String guess){
        this.in = in;
        this.key = key;
        this.guess = guess;
        if (in.length() != key.length()){
            System.out.println("Please enter a correct key");
        }
        else{
        encrypt();
        guess();
            finish();
        }
        return;
    }


    public String encrypt(){
        String temp ="";
        for (int i=0; i<in.length(); i++){
            int temp2 = (in.toUpperCase().charAt(i) + key.toUpperCase().charAt(i))%26;
            temp2+= 'A';
            temp +=(char) (temp2);
        }
        return temp;
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

    public void table(){
        String[][] test = new String[26][26];
        for (int j=0;j<26;j++){
            String temp="";
            for (int i=0;i<alphabet.length(); ++i) {
                char a = ((char) (alphabet.charAt(i) + j));
                if (a > 'z')
                    temp += (char) (alphabet.charAt(i) - (26 - j));
                else
                    temp += ((char) (alphabet.charAt(i) + j));

                test[i][j]=temp;
                }
            }
        System.out.println(test);


        for (int i=0;i<26;i++){
            for (int j = 0; j < 26; ++j) {
                System.out.println(test[i][j]);
            }
        }
    }

    public void finish(){
        System.out.println("Plain Text: "+ in);
        System.out.println("Key: " + key);
        System.out.println("Encrypted: " +encrypt().toLowerCase());
    }

}
