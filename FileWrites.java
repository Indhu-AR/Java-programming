package javaclass;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class FileWrites {

	public static void main(String[] args) throws IOException {
		FileWriter writer=new FileWriter("C:\\Users\\Indhu\\OneDrive\\Desktop\\Java\\javaclass\\src\\javaclass\\student",true);
		writer.write("hello");
		writer.write("Indhu");
		writer.close();
		

	}
}
