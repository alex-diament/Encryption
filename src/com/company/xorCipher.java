package com.company;

public class xorCipher {

    private String in;
    private String key;
    private String out;
    private String guess;
    private String alphabet = "abcdefghijklmnopqrstuvwxyz";
    xorCipher(String in, String key){
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

    public void encrypt(){



    }
    public void finish(){

    }

}
