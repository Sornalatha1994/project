package fblogin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Datadriven {
	public static void main(String[] args) throws IOException {
		
	
File F=new File("");
FileInputStream fn=new FileInputStream(F);
Workbook w=new XSSFWorkbook(fn);
Sheet s=w.getSheet("sheet1");
Row r=s.getRow(2);
Cell c = r.getCell(0);
int pc=r.getPhysicalNumberOfCells();
System.out.println(pc);
int pr=s.getPhysicalNumberOfRows();
System.out.println(pr);
for(int i=0;i<pc;i++)
{
	Cell cel=r.getCell(i);
	System.out.println(cel);
}
	for(int j=0;j<s.getPhysicalNumberOfRows();j++)
	{
		Row row=s.getRow(j);
		for(int k=0;k<row.getPhysicalNumberOfCells();k++)
		{
		Cell ce=row.getCell(k);
		System.out.println(ce);
	}
}

}
}