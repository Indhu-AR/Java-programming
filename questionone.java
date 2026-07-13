package practice;
import java.util.Scanner;
public class questionone {


	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();

	        String ans = "";
	        int maxLength = 0;

	        for (int i = 0; i < n; i++) {
	            String word = sc.next();

	            if (word.length() % 2 != 0 && word.length() > maxLength) {
	                maxLength = word.length();
	                ans = word;
	            }
	        }

	        if (maxLength == 0) {
	            System.out.println("Better luck next time");
	        } else {
	            System.out.println(ans);
	        }

	        sc.close();
	    }
	}

