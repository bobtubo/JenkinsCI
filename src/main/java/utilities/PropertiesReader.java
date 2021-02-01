package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesReader {

    //USing Static method
//    static File file = new File("src/main/resources/Config.properties");
//    static FileInputStream fis;
//    static Properties prop = new Properties();
//    public static String getNewtoursURL() throws Exception {
//        fis = new FileInputStream(file);
//        prop.load(fis);
//        return prop.getProperty("NewtoursURL");  }


    //Using non static methods
    File file = new File("src/main/resources/Config.properties");
    FileInputStream fis = new FileInputStream(file);
    public Properties prop = null;

    public PropertiesReader() throws Exception {
        prop = new Properties();
        prop.load(fis);
    }

    public String getNewtoursURL() {
        return prop.getProperty("NewtoursURL");
    }

    public String getUkbaURL() {
        return prop.getProperty("UkbaURL");
    }

    public String getBlazeDemoURL() {
        return prop.getProperty("BlazeDemoURL");
    }

    public String getNewtoursValidUsername() {
        return prop.getProperty("NewtoursValidUsername");
    }

    public String getNewtoursValidPassword() {
        return prop.getProperty("NewtoursValidPassword");
    }

    public String getMortgageCalcURL() {
        return prop.getProperty("MortgageCalculatorURL");
    }


}
