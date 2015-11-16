/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ext2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jorgecaballero
 */
public class fileSystemManager {
    RandomAccessFile file;

    public fileSystemManager() {
        try {
            File f = new File("fs.dat");
            if(f.exists() && !f.isDirectory()) { 
                this.file = new RandomAccessFile("fs.dat","rw");
                System.out.println("La estructura existe, cargando.");
            } else {
                this.file = new RandomAccessFile("fs.dat","rw");
                this.file.setLength(256000000);
                System.out.println("La estructura no existia, creando y cargando.");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(fileSystemManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(fileSystemManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
