package file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class CSV {
	private String path;
	String line = "";
	String[] lines;
	public CSV(String path) {
		this.path = path;
	}
	
	public void setPath(String path) {
		this.path = path;
	}
	
	public String getPath() {
		return this.path;
	}
	
	public String[] csvAssignTokens() {
		//String path = "C:\\Users\\Abdul Wasey\\Desktop\\AWK\\TOHACKS\\Book1.csv";
		try {
		BufferedReader br = new BufferedReader(new FileReader(this.path));
		readFile(br);
		}catch(FileNotFoundException e) {
			System.out.println("File not found.. ");
		}
		return lines;
	}
	
	public void readFile(BufferedReader br) {
		try {
			while((line = br.readLine()) != null) {
				//tokens prints tokens from NLP
				lines = line.split(",");
				for(String l: lines) {
					System.out.println(l);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
