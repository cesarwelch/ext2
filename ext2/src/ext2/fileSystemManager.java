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

    //Config
    static String FILE_NAME = "fs.dat";
    static int FILE_SYSTEM_LENGTH = 10240;
    static int NUMBER_OF_CLUSTERS = 65536;
    static int NUMBER_OF_BLOCKS = 262144;
    static int BYTES_PER_CLUSTER = 4096;
    static int BYTES_PER_BLOCK = 1024;
    static int SUPER_BLOCK_CLUSTER = 0;
    static int DATA_BLOCK_BITMAP_CLUSTER = 1;
    static int INODE_BITMAP_CLUSTER = 2;
    static int INODE_TABLE_CLUSTER = 0;
    static int DATA_BLOCKS_CLUSTER = 0;
    
    public fileSystemManager() {
        try {
            File f = new File(FILE_NAME);
            if(f.exists() && !f.isDirectory()) { 
                this.file = new RandomAccessFile(FILE_NAME,"rw");
                System.out.println("La estructura existe, cargando.");
            } else {
                this.file = new RandomAccessFile(FILE_NAME,"rw");
                this.file.setLength(FILE_SYSTEM_LENGTH);
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
        String retval = "";
        int dirStart = BYTES_PER_BLOCK * block;
        try {
            file.seek(dirStart*2);
            for (int i = 0; i < BYTES_PER_BLOCK; i++) {
                retval += file.readChar();
            }
            
        } catch (IOException ex) {
            Logger.getLogger(fileSystemManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return retval;
    }
    
    public void writeBlock(String data, int block){
        if (data.length() > BYTES_PER_BLOCK) {
            System.out.println("Error: La data excede el tamaño del bloque.");
        } else {
            int dirStart = BYTES_PER_BLOCK * block;
            try {
                file.seek(dirStart*2);
                file.writeChars(data);
            } catch (IOException ex) {
                Logger.getLogger(fileSystemManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
    public String getCluster(int cluster){
        String retval = "";
        int dirStart = BYTES_PER_CLUSTER*cluster;
        try {
            file.seek(dirStart*2);
            for (int i = 0; i < BYTES_PER_CLUSTER; i++) {
                retval += file.readChar();
            }
            
        } catch (IOException ex) {
            Logger.getLogger(fileSystemManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return retval;
    }
    
    public void writeCluster(String data, int cluster){
        if (data.length() > BYTES_PER_CLUSTER) {
            System.out.println("Error: La data excede el tamaño del cluster.");
        } else {
            int dirStart = BYTES_PER_BLOCK * cluster;
            try {
                file.seek(dirStart*2);
                file.writeChars(data);
            } catch (IOException ex) {
                Logger.getLogger(fileSystemManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public String getSuperBlock(){
        String retval = "";
        try {
            file.seek(SUPER_BLOCK_CLUSTER*2);
            for (int i = 0; i < BYTES_PER_CLUSTER; i++) {
                retval += file.readChar();
            }
            
        } catch (IOException ex) {
            Logger.getLogger(fileSystemManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return retval;
    }
    
    public void setSuperBlock(String data){
        if (data.length() > BYTES_PER_CLUSTER) {
            System.out.println("Error: La data excede el tamaño del cluster.");
        } else {
            try {
                file.seek(SUPER_BLOCK_CLUSTER*2);
                file.writeChars(data);
            } catch (IOException ex) {
                Logger.getLogger(fileSystemManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public String getDataBlockBitmap(){
        String retval = "";
        try {
            file.seek(DATA_BLOCK_BITMAP_CLUSTER*2);
            for (int i = 0; i < BYTES_PER_CLUSTER; i++) {
                retval += file.readChar();
            }
            
        } catch (IOException ex) {
            Logger.getLogger(fileSystemManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return retval;
    }
    
    public void setDataBlockBitmap(String data){
        if (data.length() > BYTES_PER_CLUSTER) {
            System.out.println("Error: La data excede el tamaño del cluster.");
        } else {
            try {
                file.seek(DATA_BLOCK_BITMAP_CLUSTER*2);
                file.writeChars(data);
            } catch (IOException ex) {
                Logger.getLogger(fileSystemManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public String getInodeBitmap(){
        String retval = "";
        try {
            file.seek(INODE_BITMAP_CLUSTER*2);
            for (int i = 0; i < BYTES_PER_CLUSTER; i++) {
                retval += file.readChar();
            }
            
        } catch (IOException ex) {
            Logger.getLogger(fileSystemManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return retval;
    }
    
    public void setInodeBitmap(String data){
        if (data.length() > BYTES_PER_CLUSTER) {
            System.out.println("Error: La data excede el tamaño del cluster.");
        } else {
            try {
                file.seek(INODE_BITMAP_CLUSTER*2);
                file.writeChars(data);
            } catch (IOException ex) {
                Logger.getLogger(fileSystemManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public String getInodeTable(){
        String retval = "";
        try {
            file.seek(INODE_TABLE_CLUSTER*2);
            for (int i = 0; i < BYTES_PER_CLUSTER; i++) {
                retval += file.readChar();
            }
            
        } catch (IOException ex) {
            Logger.getLogger(fileSystemManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return retval;
    }
    
    public void setInodeTable(String data){
        if (data.length() > BYTES_PER_CLUSTER) {
            System.out.println("Error: La data excede el tamaño del cluster.");
        } else {
            try {
                file.seek(INODE_TABLE_CLUSTER*2);
                file.writeChars(data);
            } catch (IOException ex) {
                Logger.getLogger(fileSystemManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
}
