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
    //Total number of clusters = 65,536
    //Total number of blocks = 262,144
    static int SUPER_BLOCK_CLUSTER = 0;
    static int DATA_BLOCK_BITMAP_CLUSTER = 1;
    static int INODE_BITMAP_CLUSTER = 2;
    static int INODE_TABLE_CLUSTER = 0;
    static int DATA_BLOCKS_CLUSTER = 0;
    
    public fileSystemManager() {
        try {
            File f = new File("fs.dat");
            if(f.exists() && !f.isDirectory()) { 
                this.file = new RandomAccessFile("fs.dat","rw");
                System.out.println("La estructura existe, cargando.");
            } else {
                this.file = new RandomAccessFile("fs.dat","rw");
                this.file.setLength(10240);
                System.out.println("La estructura no existia, creando y cargando.");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(fileSystemManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(fileSystemManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String read(int dirStart, int size){
        String retval = "";
        try {
            file.seek(dirStart*2);
            //file.readUTF();
            for (int i = 0; i < size; i++) {
                retval += file.readChar();
            }
            
        } catch (IOException ex) {
            Logger.getLogger(fileSystemManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return retval;
    }
    
    public void write(String data, int dirStart){
        try {
            file.seek(dirStart*2);
            file.writeChars(data);
        } catch (IOException ex) {
            Logger.getLogger(fileSystemManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String getBlock(int block){
        
        return "ja";
    }
    
    public void writeBlock(String block){
        
    }
    
    public String getCluster(int cluster){
        
        return "ja";
    }
    
    public void writeCluster(String cluster){
        
    }
    
    
}
