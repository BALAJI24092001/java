import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;
public class fileOperations{
	public static void main(String[] args) throws IOException {

		FileReader read = new FileReader("file.txt");
		int i = 0;
		while((i = read.read())!= -1){
			System.out.print((char)i);
		}
		read.close();
		
		FileWriter write = new FileWriter("file1.txt");
		write.append("Yoov suskobale...");
		write.close();

		File pile = new File("file.txt");
		Scanner inp = new Scanner(pile);
		while(inp.hasNextLine()){
			System.out.println(inp.nextLine());
		}
		inp.close();
		
	}
}
