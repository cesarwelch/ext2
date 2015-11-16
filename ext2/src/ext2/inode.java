/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ext2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Cesar
 */
public class inode {

    public inode(String[] i_mode, String i_uid, int i_size, Date i_atime, Date i_mtime, String i_gid, int i_links_count, int i_blocks, int[] i_block, int indirect_block_pointer) {
        this.i_mode = i_mode;
        this.i_uid = i_uid;
        this.i_size = i_size;
        this.i_atime = i_atime;
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Date date = new Date();
	this.i_ctime = date;
        this.i_mtime = i_mtime;
        this.i_dtime = null;
        this.i_gid = i_gid;
        this.i_links_count = i_links_count;
        this.i_blocks = i_blocks;
        this.i_block = i_block;
        this.indirect_block_pointer = indirect_block_pointer;
    }

  
    
    private String[] i_mode;
    //space 0 for type, 0 for permisions 742 format permission.
    
    private String i_uid;
    //id from owner
    
    private int i_size;
    //Size of file
    
    private Date i_atime;
    //access time
    
    private Date i_ctime;
    //creating time
    
    private Date i_mtime;
    //Mod time
    
    private Date i_dtime;
    //delete tme
    
    private String i_gid;
    
    private int i_links_count;
    
    private int i_blocks;
    
    private int[] i_block;
    
    private int[] direct_block_pointers  = new int[12];
     
    private int indirect_block_pointer;
    
    
    /**
     * Get the value of direct_block_pointer
     *
     * @return the value of direct_block_pointer
     */
    public int getIndirect_block_pointer() {
        return indirect_block_pointer;
    }

    /**
     * Set the value of direct_block_pointer
     *
     * @param direct_block_pointer new value of direct_block_pointer
     */
    public void setIndirect_block_pointer(int indirect_block_pointer) {
        this.indirect_block_pointer = indirect_block_pointer;
    }


       

    /**
     * Get the value of direct_block_pointers
     *
     * @return the value of direct_block_pointers
     */
    public int[] getDirect_block_pointers() {
        return direct_block_pointers;
    }

    /**
     * Set the value of direct_block_pointers
     *
     * @param direct_block_pointers new value of direct_block_pointers
     */
    public void setDirect_block_pointers(int[] direct_block_pointers) {
        this.direct_block_pointers = direct_block_pointers;
    }

    /**
     * Get the value of i_block
     *
     * @return the value of i_block
     */
    public int[] getI_block() {
        return i_block;
    }

    /**
     * Set the value of i_block
     *
     * @param i_block new value of i_block
     */
    public void setI_block(int[] i_block) {
        this.i_block = i_block;
    }

    /**
     * Get the value of i_blocks
     *
     * @return the value of i_blocks
     */
    public int getI_blocks() {
        return i_blocks;
    }

    /**
     * Set the value of i_blocks
     *
     * @param i_blocks new value of i_blocks
     */
    public void setI_blocks(int i_blocks) {
        this.i_blocks = i_blocks;
    }

    /**
     * Get the value of i_links_count
     *
     * @return the value of i_links_count
     */
    public int getI_links_count() {
        return i_links_count;
    }

    /**
     * Set the value of i_links_count
     *
     * @param i_links_count new value of i_links_count
     */
    public void setI_links_count(int i_links_count) {
        this.i_links_count = i_links_count;
    }

    /**
     * Get the value of i_gid
     *
     * @return the value of i_gid
     */
    public String getI_gid() {
        return i_gid;
    }

    /**
     * Set the value of i_gid
     *
     * @param i_gid new value of i_gid
     */
    public void setI_gid(String i_gid) {
        this.i_gid = i_gid;
    }

    /**
     * Get the value of i_dtime
     *
     * @return the value of i_dtime
     */
    public Date getI_dtime() {
        return i_dtime;
    }

    /**
     * Set the value of i_dtime
     *
     * @param i_dtime new value of i_dtime
     */
    public void setI_dtime(Date i_dtime) {
        this.i_dtime = i_dtime;
    }

    /**
     * Get the value of i_mtime
     *
     * @return the value of i_mtime
     */
    public Date getI_mtime() {
        return i_mtime;
    }

    /**
     * Set the value of i_mtime
     *
     * @param i_mtime new value of i_mtime
     */
    public void setI_mtime(Date i_mtime) {
        this.i_mtime = i_mtime;
    }

    /**
     * Get the value of i_ctime
     *
     * @return the value of i_ctime
     */
    public Date getI_ctime() {
        return i_ctime;
    }

    /**
     * Set the value of i_ctime
     *
     * @param i_ctime new value of i_ctime
     */
    public void setI_ctime(Date i_ctime) {
        this.i_ctime = i_ctime;
    }

    
    /**
     * Get the value of i_atime
     *
     * @return the value of i_atime
     */
    public Date getI_atime() {
        return i_atime;
    }

    /**
     * Set the value of i_atime
     *
     * @param i_atime new value of i_atime
     */
    public void setI_atime(Date i_atime) {
        this.i_atime = i_atime;
    }

    /**
     * Get the value of i_size
     *
     * @return the value of i_size
     */
    public int getI_size() {
        return i_size;
    }

    /**
     * Set the value of i_size
     *
     * @param i_size new value of i_size
     */
    public void setI_size(int i_size) {
        this.i_size = i_size;
    }

    public String getI_uid() {
        return i_uid;
    }

    public void setI_uid(String i_uid) {
        this.i_uid = i_uid;
    }

    /**
     * Get the value of i_mode
     *
     * @return the value of i_mode
     */
    public String[] getI_mode() {
        return i_mode;
    }

    /**
     * Set the value of i_mode
     *
     * @param i_mode new value of i_mode
     */
    public void setI_mode(String[] i_mode) {
        this.i_mode = i_mode;
    }

    
}
