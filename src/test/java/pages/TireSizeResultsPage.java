package pages;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class TireSizeResultsPage extends BasePage{

    String urlCatalogSize= "https://www.bridgestonetire.com/catalog/size/";
    String tsUrl = "";
    LinkedHashSet<LinkedHashSet<String>> hashSet= new LinkedHashSet<LinkedHashSet<String> >();
    String numberOfResults="";


    public TireSizeResultsPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='tire-filter-results h4']/span")
    WebElement numberResults;



    public void openResultsWindows() throws IOException {
        //Removing any empty or null items from the list of Tire Sizes
        tiresSizes.removeAll(Arrays.asList("", null));
        //hashset will store the data that will be written on a Excel file
        hashSet.add(new LinkedHashSet<String>(Arrays.asList("TIRE SIZE", "TIRE COUNT","URL")));

        //Iterating over tireSizes
        //Each iteration will open the respective URL for a tire size
        //resultsOnPage.size() will be equal to 0 if no results are found on the page opened
        //If no results are found on a page, test will continue and Count will be added as 0 in the excel file.
        for(String tireSize:tiresSizes){
            tsUrl = urlCatalogSize+tireSize.replace("/","-");
            driver.get(tsUrl);
            List<WebElement> resultsOnPage = driver.findElements(By.xpath("//div[@class='tire-filter-results h4']/span"));
                if (resultsOnPage.size() > 0){
                        numberOfResults = numberResults.getText();
                } else if (resultsOnPage.size() == 0)
                {
                        numberOfResults = "0";
                }

                //Tire Size, Count and URL will be added to the hashSet on each iteration
            hashSet.add(new LinkedHashSet<String>(Arrays.asList(tireSize, numberOfResults, getCurrentURL())));
        }
    }

    public void writeToExcel() throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("TIRE_SIZE_RESULTS");

        int rowNo=0;
        //Iterate over hashset that contains Tire Sizes, Tire Count, URL for each TireSize
        //To Add new Cells to a workbook
        for (Set<String> result: hashSet) {
                XSSFRow row=sheet.createRow(rowNo++);
                int columnCount=0;
                for(String value : result)
                {
                    XSSFCell cell= row.createCell(columnCount++);
                    cell.setCellValue(value);
                }
            }

        //Writing the workbook data on the Excel File
        //filePath will be the location of the file
        //Each time the tests are executed, if the file already exists it will be replaced with latest results
        String filePath = "test-output/TIRE-SIZE-RESULTS.xlsx";
        FileOutputStream file = new FileOutputStream(filePath);
        workbook.write(file);
        file.close();
        System.out.println("Data Copied to Excel");
    }
}
