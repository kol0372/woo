
package ex1;

import java.io.File;

/**
 * @author kosta
 * Document    : DirectoryCreation created on : 2014. 9. 18, ¿ÀÀü 11:47:29
 */
public class DirectoryCreation {
    public static void main(String[] args) {
        
        String baseDir = ".\\src\\chapter9\\file\\";
        
        File dir1 = new File(baseDir + "dir1");
        boolean ismade = dir1.mkdir();
        System.out.println("new directory is made : " + ismade);
        
        File dir2 = new File(baseDir + "parent\\dir2");
        ismade = dir2.mkdirs();
        System.out.println("new directory is made : " + ismade);
        
        boolean isdelete = dir1.delete();
        
    }
    

}
