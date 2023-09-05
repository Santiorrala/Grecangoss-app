package com.example.grecangoss_app;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class ExcelReader {
    public static List<Producto> readerProductos(InputStream inputStream) throws IOException{
        List<Producto> productos = new ArrayList<>();

        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(0);

        for (Row row : sheet){
            if (row.getRowNum()== 0){
                continue;
            }
            Producto producto = new Producto(
                    row.getCell(0).getStringCellValue(),
                    row.getCell(1).getStringCellValue(),
                    row.getCell(2).getStringCellValue(),
                    row.getCell(3).getStringCellValue(),
                    row.getCell(4).getStringCellValue(),
                    row.getCell(5).getStringCellValue()
            );

            productos.add(producto);
        }
        workbook.close();
        inputStream.close();
        return productos;
    }
}
