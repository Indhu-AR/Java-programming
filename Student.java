package javaclass;

import java.util.Arrays;

public class Student {
	//data members
       String name;
       int rollNo;
       int mark[];
       String department;
       //non paramaterized constructor
       Student(){
    	   this.department="ECE";
    	   System.out.println("Inside NonParametrized Constructor");
       }
       //constructor  nn   
       Student(String personname,int rollno,int[] marks){
    	   this.name=personname;
    	   this.rollNo=rollNo;
    	   this.mark=mark;
       }
  //methods
       int calculateTotal(){
    	 int total=0;
    	 for( int i=0;i<mark.length;i++)
    	 {
    		 total+=mark[i];
    	 }
    	 return total;
       }
       
       void display() {
    	   System.out.println("Name: "+name);
	       System.out.println("RollNo: "+rollNo);
	       System.out.println("Department: "+department);
		   System.out.println(Arrays.toString(mark));
	        
       }
}
