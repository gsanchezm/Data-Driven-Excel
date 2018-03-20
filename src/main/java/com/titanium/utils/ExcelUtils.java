package com.titanium.utils;

public class ExcelUtils {

    public static Object[][] getTableArray(String FilePath, String SheetName) throws Exception {
        String[][] tabArray = null;
        /*try {


        }catch (FileNotFoundException e){
            throw new Exception("Class ExcelUtils | Method getTableArray | Exception desc: Excel not found: "+e.getMessage());
        }catch (IOException e){
            throw new Exception("Class ExcelUtils | Method getTableArray | Exception desc: Could not read the Excel sheet: "+e.getMessage());
        }*/
        return(tabArray);
    }

    public static String getCellDataDDT(int RowNum, int ColNum) throws Exception {
        try{

            return null;
        }catch (Exception e){
            throw new Exception("Class ExcelUtils | Method getCellDataDDT | Exception desc: " + e.getMessage());
        }
    }
}
