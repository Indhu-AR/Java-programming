package javaclass;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class Filereads {

	public static void main(String[] args)  throws IOException{
		FileReader fr = new FileReader("C:\\Users\\Indhu\\OneDrive\\Desktop\\Java\\javaclass\\src\\javaclass\\student");
		int ch;
		while((ch=fr.read())!=-1) {
			System.out.println((char)ch);

	}

	}
}
