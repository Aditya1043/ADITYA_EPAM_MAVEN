package org.epamMavenOOPS.Treats;
public class treat implements Comparable<treat>{

    private String name;
    private int price;
    private int weight;

    public treat(){
        price=0;
        weight=0;
    }

    public treat(String name,int price,int weight){
        this.name=name;
        this.price=price;
        this.weight=weight;
    }

    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }

    public int getWeight(){
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String toString(){
        return "Name : "+name+" Weight : "+weight+" Price : "+price;
    }

    public int compareTo(treat s){ 
        return getPrice()-s.getPrice();
    }
}