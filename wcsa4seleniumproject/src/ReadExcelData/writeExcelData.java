package ReadExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class writeExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	  FileInputStream fis = new FileInputStream("./data/InstagramTestData.xlsx");
      Workbook wb = WorkbookFactory.create(fis);
	  Sheet sheet = wb.getSheet("validcreds");
	  Row row = sheet.getRow(0);
	  Cell cell = row.createCell(0);
	  cell.setCellValue("Link");
	  
	}

}
