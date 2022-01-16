package com.sl.l3.assistedprsctice;

public class TestDiamond implements Diamond1, Second 
{  
    public void show() 
    {  
        Diamond1.super.show(); 
        Second.super.show(); 
    } 
    public static void main(String args[]) 
    { 
        TestDiamond ob = new TestDiamond(); 
        ob.show(); 
    } 
}
