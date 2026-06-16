package practice;

public class StringRotation {
    public static void main(String[] args) {
        String S1 = "waterbottle";
        String S2 = "ttlewaterbo";

        String temp = S1 + S1;

        if (S1.length() == S2.length() && temp.contains(S2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}