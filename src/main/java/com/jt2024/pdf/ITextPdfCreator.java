package com.jt2024.pdf;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;

import java.io.FileOutputStream;
import java.io.IOException;

public class ITextPdfCreator {
    public static void main(String[] args) {

        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream("template.pdf"));

            document.open();
            Font font = FontFactory.getFont(FontFactory.COURIER, 16, BaseColor.BLACK);
            Chunk chunk = new Chunk("Hello World", font);

            document.add(chunk);
            document.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


        try {
            // Step 2: Read the template
            PdfReader reader = new PdfReader("template.pdf");

            // Step 3: Initialize PdfStamper
            PdfStamper stamper = new PdfStamper(reader, new FileOutputStream("output.pdf"));

            // Step 4: Get the over content
            PdfContentByte over = stamper.getOverContent(1);

            // Step 5: Replace the placeholder with actual data
            ColumnText.showTextAligned(over, Element.ALIGN_LEFT, new Phrase("John Doe"), 50, 700, 0);

            // Step 6: Close the PdfStamper
            stamper.close();
            reader.close();
        } catch (IOException | DocumentException e) {
            e.printStackTrace();
        }
    }
}
