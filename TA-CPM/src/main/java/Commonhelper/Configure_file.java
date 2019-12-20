package Commonhelper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configure_file {

	public Properties prop;

	public Configure_file() {

		File fil = new File("./Congig/config.properties");

		try {
			FileInputStream file = new FileInputStream(fil);
			prop = new Properties();
			prop.load(file);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Config file not found >>" + e.getMessage());
		}

	}

	public void test() {
		System.out.println("testing done");
	}

	public String get_browser() {
		return prop.getProperty("Browser");
	}

	public String get_url() {
		return prop.getProperty("Url");
	}
}
