package com.codeup.java.LittleBlackBook;

import java.util.ArrayList;

public class Contacts {


    private String nameNum;
    private String phoneNum;

    public String toString(){
        return nameNum;
    }

    public String getName() {
        return nameNum;
    }
    public void setName(String name) {
        this.nameNum = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Contacts (){}
    public Contacts (String name, String phoneNum){
        this.nameNum = name + "-" + phoneNum;

    }
}//end of Contacts class
