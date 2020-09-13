package file;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument; 


public class CSVTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\Abdul Wasey\\Desktop\\AWK\\TOHACKS\\Book1.csv";
		CSV c = new CSV(path);
		System.out.println(c.getPath());
		//String[] vals = new String[100];
		c.csvAssignTokens();
		
//		PDDocument pdf1 = new PDDocument();
//		try {
//			pdf1.save("C:\\PDFexample\\newDoc1");
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		System.out.println("Document created");
//		try {
//			pdf1.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}
