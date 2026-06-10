package javaclass;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class IOexceptionclass {
public static void main(String[] args) {
	try {
		FileReader f =new FileReader("C:\\Users\\Indhu\\OneDrive\\Desktop\\Java\\javaclass\\src\\javaclass\\student");
		System.out.println("File Opened");
	} catch(FileNotFoundException e){
		System.out.println("File not Found");
	}
}
}