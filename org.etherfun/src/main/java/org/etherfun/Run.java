package org.etherfun;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;

public class Run {
	
	public static void main(String[] args) throws IOException {
		
		File f0 = new File("/opt/CV/Abramek_S_CV0.pdf");
		File f1 = new File("/opt/CV/Personality ID.pdf");
		File f2 = new File("/opt/CV/Abramek_S_CV.pdf");
		
		System.out.println(f0.exists());
		System.out.println(f1.exists());
		
		PDDocument doc0 = Loader.loadPDF(f0);
		PDDocument doc1 = Loader.loadPDF(f1);
		PDDocument doc2 = new PDDocument();
		
		doc2.addPage(doc0.getPage(0));
		
		doc2.addPage(doc1.getPage(0));
		doc2.save(f2);
//		doc0.save(f0);
	}

}
