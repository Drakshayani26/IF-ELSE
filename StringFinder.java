package com.stackroute.basics;

import java.util.Scanner;

public class StringFinder {
    //Create Scanner object as instance variable
	Scanner ab=new Scanner(System.in);
	

    public static void main(String[] args) {
        //Get three strings from the user
    	StringFinder obj=new StringFinder();
    	obj.getInput();
    	
    }

    public String getInput() {
    	String str =ab.nextLine();
    	String first=ab.nextLine();
    	String second=ab.nextLine();
    	int k=findString(str,first,second);
    	displayResult(k);
    	ab.close();
    	
    	
    	return null;
    }
    
    	
    
    	
  

    public void displayResult(int result) {
    	if(result==1)
    		System.out.println("Found as expected");
    	if(result==0)
    		System.out.println("Not found");
    	if(result==-1)
    		System.out.println("Empty String or null");
    	
        //displays the result
    	
    	}
    
    public int findString(String searchString, String firstString, String secondString) {
    	if (searchString==null || firstString == null || secondString == null) {
    		return -1;
    	}
    	else if (firstString.isEmpty()||secondString.isEmpty()|| searchString.isEmpty()) {
    		return -1;
    	}
    	else {
    		int pos1=searchString.indexOf(firstString);
    		int pos2=searchString.indexOf(secondString);
    	if(pos1<pos2&&pos1!=-1&&pos2!=-1) {
    		return(1);
    	}
    	else {
    		return(0);
    		
    		
    	
    	}
    		
    	
    	
    	
    	}
    }
    
        
  

    public void closeScanner() {
    	ab.close();
    }
}	
