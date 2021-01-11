package Learn_Selenium;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;




public class FileWritingConcepts {

	static Logger logger=Logger.getLogger(FileWritingConcepts.class);
	public static void main(String[] args) {
		try{
			PropertyConfigurator.configure("log4j.properties");
			logger.info("Hi");
			logger.warn("helo");
			/*String location="JesusAlways.txt";
			String content="Jesus Never Fails";
			FileWriter fileWriter=new FileWriter(location);
			fileWriter.write(content);
			fileWriter.close();*/
			/*File Read*/
			/*String location="JesusAlways.txt";			
			FileReader reader= new FileReader(location);
			BufferedReader buffReader = new BufferedReader(reader);
			String content=buffReader.readLine();
			while((content=buffReader.readLine())!=null){
				System.out.println(content);
			}*/
		}
		catch(Exception ex){
			throw ex;
		}
	
	}

}
