package set;
import java.util.*;
public class hashset {

	public static void main(String[] args) {
		TreeSet<Integer> s1=new TreeSet<>();
		int [] arr= {1,1,2,2,3,4,4,5,6,6};
		for(int i=0;i<arr.length;i++) {
			s1.add(arr[i]);
		}
		System.out.println(s1);
		
		

	}

}
