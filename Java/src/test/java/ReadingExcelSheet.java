import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.IOException;

public class ReadingExcelSheet {
    @Test
    public void readData() throws IOException {
        XSSFWorkbook workBook = new XSSFWorkbook("src/main/resources/TestData.xlsx");
        String ct = workBook.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
        System.out.println(ct);
    }

    @Test
    public void knowDataTypeOfCell() throws IOException {
        XSSFWorkbook workBook = new XSSFWorkbook("src/main/resources/TestData.xlsx");
        CellType ct = workBook.getSheet("Sheet1").getRow(1).getCell(0).getCellType();
        if (ct==CellType.STRING){
            String value = workBook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
            System.out.println(value);
        } else if (ct==CellType.NUMERIC){
            double value = workBook.getSheet("Sheet1").getRow(1).getCell(0).getNumericCellValue();
            System.out.println(value);
        }
    }
}
