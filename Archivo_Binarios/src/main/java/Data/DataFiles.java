package Data;

import Class.Person;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author Juan_K
 */
public class DataFiles {
    
    public static String directory = System.getProperty("user.home");
    public static String fileName = "persons.dat";
    public static String filePath = directory + File.separator + "Pruebas" + File.separator + fileName;
    public static String filePathCSV = directory + File.separator + "Pruebas" + File.separator + "Persons.csv";
    
    public static ArrayList<Person> p = new ArrayList();
}
