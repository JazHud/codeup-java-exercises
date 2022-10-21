package com.codeup.java.animals;

public class Parrot extends Bird {

    public final static String order = "Psittaciformes";
    // to keep this the same even through method manipulation like with the argumentativeOrnithologist method in bird test will not work since it is final::: final can also be used on the Parrot and no more extensions can be made of Parrot:: final on methods can not be overridden either;
    public void makeNoise() {
        super.makeNoise(); //<-- using the method of its superclass
        System.out.println("When torrential water tosses boulders, it is because of its momentum; when the struck of a hawk breaks the body of its prey, it is because of timing. Thus the momentum of one skilled in war is overwhelming, their attack precisely regulated. Their potential is that of a full drawn crossbow; their timing, the release of the trigger.");
    }

    public void echo(String repeat){
        System.out.println(repeat);
    }

    public Parrot(){
        super(); // runs the superclass constructor but by default it's already done
        System.out.println("A new parrot just got constructed!");
    }
    public void setName(String parrotName){
        super.setName(parrotName);   //<-super is needed, or it will just bounce back and forth between the superclass aka object indefinably causing an overstack error
    }

}
