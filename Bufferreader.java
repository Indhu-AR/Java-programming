package javaclass;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Bufferreader {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				 new FileReader("C:\\Users\\Indhu\\OneDrive\\Desktop\\Java\\javaclass\\src\\javaclass\\student"));
				 String line;
				        while ((line = br.readLine()) != null) {
				            System.out.println(line);
				            
				        }

				        br.close();
	}

}
