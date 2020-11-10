package Data;

import static Data.DataFiles.p;

/**
 *
 * @author Juan_K
 */
public class Search {
    
    public static int searchByID(String name){
        for ( int i = 0 ; i < p.size() ; i++ ){
            if(p.get(i).getNombre().equals(name)){
                return i;
            }
        }
        return -1;
    }
}
