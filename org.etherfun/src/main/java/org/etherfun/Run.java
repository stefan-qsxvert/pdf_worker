package org.etherfun;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.PDFRenderer;

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
//		System.out.println();
//		doc2.save(f2);
//		doc0.save(f0);

		PDFRenderer pdren = new PDFRenderer(doc1);
		BufferedImage bfimg = pdren.renderImageWithDPI(0, 800);
		ImageIO.write(bfimg, "png", new File("/opt/CV/talentpilot.png"));
		
		System.out.println("ok!");
		
	}

}
