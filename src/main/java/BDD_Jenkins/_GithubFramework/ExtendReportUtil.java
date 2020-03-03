package BDD_Jenkins._GithubFramework;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.google.common.io.Files;

public class ExtendReportUtil extends BaseUtil{

	String fileName = reportLocation + "extendreport.html";
	
	public void ExtentReport(){
		//first is to create Extend reports
		extent = new ExtentReports();
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(fileName);
		htmlReporter.config().setTheme(Theme.DARK);
		htmlReporter.config().setDocumentTitle("Test report for selenium");
		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setReportName("Test report");
		
		extent.attachReporter(htmlReporter);
	}
	
	public void ExtentReportScreenshot() throws IOException{
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(screenshot, new File(reportLocation+"screenshot.png"));
	}
	
	public void FlushReport() {
		extent.flush(); 
	}
}
