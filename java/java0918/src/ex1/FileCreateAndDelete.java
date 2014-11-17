
package ex1;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author kosta
 * Document    : FileCreateAndDelete created on : 2014. 9. 18, ¿ÀÀü 11:48:03
 */
public class FileCreateAndDelete {
    
    public static void main(String[] args) {
        
        File file = new File("newFile.txt");
        
        boolean isCreated = false;
        
        try {
            isCreated = file.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(FileCreateAndDelete.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("new file is created : " + isCreated);
        System.out.println("file.exists() : " + file.exists());
        
        
        
        boolean isDeleted = file.delete();
        
        System.out.println("file is delected : " + isDeleted);
        System.out.println("file.exisis() : " + file.exists());
        
        
        
    }

}
