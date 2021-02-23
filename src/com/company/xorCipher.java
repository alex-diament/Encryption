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
        encrypt();
        finish();
        return;
    }

    public String encrypt(){
        String temp = "";
        int temp2=0;
    for(int i=0;i<in.length();i++){
        int temp3 =in.charAt(i) ^ key.charAt(temp2);
        temp +=String.format("%02x",(byte) temp3);
        temp2++;
        if (temp2>=key.length()){
            temp2=0;
        }

    }
    return temp;
    }

    public void finish(){
        System.out.println("Plain Text: "+ in);
        System.out.println("Key: " + key);
        System.out.println("Encrypted: " +encrypt().toLowerCase());
    }

}
