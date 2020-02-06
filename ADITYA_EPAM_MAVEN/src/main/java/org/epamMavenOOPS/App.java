package org.epamMavenOOPS;


import org.epamMavenOOPS.Treats.*;

import org.epamMavenOOPS.gift.*;



public class App{
    public static void main(String args[]){
        treat t1=new chocolate("FUSE",100,80);
        treat t2=new chocolate("Silk",200,10);
        treat t3=new chewingGum("Gummy Bear",10,80);
        treat t4=new chewingGum("Mentos",15,98);

        Gift presents=new Gift();

        presents.add(t1);
        presents.add(t2);
        presents.add(t3);
        presents.add(t4);

        System.out.println(presents.getWeights());
        System.out.println(presents.toString());
    }
}
