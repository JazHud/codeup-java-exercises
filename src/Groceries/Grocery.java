package com.codeup.java.Groceries;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Grocery {

    public String item;
    public ArrayList<String> categoryList;
    public HashMap<String, String> itemAndAmount;

    public String toString(){
        return item;
    }


    public Grocery(){}

    public Grocery(String item, String category, String amount){
        this.item = item;
        this.categoryList = new ArrayList<>(Collections.singleton(category));
        this.itemAndAmount = new HashMap<>(Integer.parseInt(amount));
    }
//    public void groceryItem(){
//        itemObject.put(item, category);
//    }

}
