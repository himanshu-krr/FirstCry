package com.firstcry.utilities;

import org.apache.poi.ss.usermodel.*;
import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

public class ExcelReader {

    private static final String TEST_DATA_PATH = "src/resources/testdata/TestData.xlsx";

    public static Map<String, String> getStoreData() {
        Map<String, String> data = new HashMap<>();
        try (FileInputStream fis = new FileInputStream(new File(TEST_DATA_PATH));
             Workbook workbook = WorkbookFactory.create(fis)) {

            Sheet sheet = workbook.getSheet("FindStore");
            Row row = sheet.getRow(1);

            data.put("storeType", row.getCell(0).getStringCellValue());
            data.put("state", row.getCell(1).getStringCellValue());
            data.put("city", row.getCell(2).getStringCellValue());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }

    public static Map<String, String> getPincodeData() {
        Map<String, String> data = new HashMap<>();
        try (FileInputStream fis = new FileInputStream(new File(TEST_DATA_PATH));
             Workbook workbook = WorkbookFactory.create(fis)) {

            Sheet sheet = workbook.getSheet("FindPreschool");
            Row row = sheet.getRow(1);

  
            DataFormatter formatter = new DataFormatter();

            data.put("validPincode", formatter.formatCellValue(row.getCell(0)));
            data.put("invalidPincode", formatter.formatCellValue(row.getCell(1)));

        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }

}
