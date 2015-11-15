/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ext2;

/**
 *
 * @author Cesar
 */
public class superblock {
    
    private int t_part;
    
    private int tam_block;

    private int num_totblocks;

    private int num_freedatablocks;

        private int num_freeinodes;

    /**
     * Get the value of num_freeinodes
     *
     * @return the value of num_freeinodes
     */
    public int getNum_freeinodes() {
        return num_freeinodes;
    }

    /**
     * Set the value of num_freeinodes
     *
     * @param num_freeinodes new value of num_freeinodes
     */
    public void setNum_freeinodes(int num_freeinodes) {
        this.num_freeinodes = num_freeinodes;
    }

    /**
     * Get the value of num_freedatablocks
     *
     * @return the value of num_freedatablocks
     */
    public int getNum_freedatablocks() {
        return num_freedatablocks;
    }

    /**
     * Set the value of num_freedatablocks
     *
     * @param num_freedatablocks new value of num_freedatablocks
     */
    public void setNum_freedatablocks(int num_freedatablocks) {
        this.num_freedatablocks = num_freedatablocks;
    }

    /**
     * Get the value of num_totblocks
     *
     * @return the value of num_totblocks
     */
    public int getNum_totblocks() {
        return num_totblocks;
    }

    /**
     * Set the value of num_totblocks
     *
     * @param num_totblocks new value of num_totblocks
     */
    public void setNum_totblocks(int num_totblocks) {
        this.num_totblocks = num_totblocks;
    }

    /**
     * Get the value of tam_block
     *
     * @return the value of tam_block
     */
    public int getTam_block() {
        return tam_block;
    }

    /**
     * Set the value of tam_block
     *
     * @param tam_block new value of tam_block
     */
    public void setTam_block(int tam_block) {
        this.tam_block = tam_block;
    }

    /**
     * Get the value of t_part
     *
     * @return the value of t_part
     */
    public int getT_part() {
        return t_part;
    }

    /**
     * Set the value of t_part
     *
     * @param t_part new value of t_part
     */
    public void setT_part(int t_part) {
        this.t_part = t_part;
    }

}
