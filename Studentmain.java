package javaclass;

public class Studentmain {


public static void main(String[] args) {
		int[] marks= {95,65,57};
		Student s1 = new Student();
		    s1.name = "Rahul";
	        s1.rollNo = 20;
	        s1.mark = new int[]{97, 76, 56};
	        System.out.println(s1.name);
	        System.out.println(s1.rollNo);
	        System.out.println(s1.calculateTotal());
	        s1.display();
	}

}