package com.driver;

public class Main {
    public static class A{
        public String hh(){
            return "Invoking method from class A";
        }
    }
public static class B extends A{
        public String hh(){
            return "Method is overridden in Extendend class B";
        }
}
public static void main(String [] args){
        B b=new B();
        b.hh();
}
  
}