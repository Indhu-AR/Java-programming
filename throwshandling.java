package javaclass;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class throwshandling {
	public static void main(String[] args) throws FileNotFoundException {
		m1();
	}

	static void m1() throws FileNotFoundException, ArithmeticException {
		FileReader f = new FileReader(
			"C:\\Users\\Indhu\\OneDrive\\Desktop\\Java\\javaclass\\src\\javaclass\\student"
		);
	}
}

