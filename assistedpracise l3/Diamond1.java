package com.sl.l3.assistedprsctice;

interface Diamond1 {
	default void show() 
    { 
        System.out.println("Default First"); 
    } 

}
interface Second 
{  
    default void show() 
    { 
        System.out.println("Default Second"); 
    } 
}  
