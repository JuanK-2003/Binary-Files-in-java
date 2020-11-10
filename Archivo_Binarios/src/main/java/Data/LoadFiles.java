package Data;

import Class.Person;
import static Data.DataFiles.filePath;
import static Data.DataFiles.p;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Juan_K
 */
public class LoadFiles {
    
    public static void load () throws IOException {
        Object b = null;
        
        try {
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream ois = new ObjectInputStream(fis);
            while( ( b = ois.readObject() ) != null){
                p.add((Person) b);
            }
            ois.close();
            fis.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LoadFiles.class.getName()).log(Level.SEVERE, null, ex);
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(LoadFiles.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
