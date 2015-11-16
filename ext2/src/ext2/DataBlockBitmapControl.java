/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ext2;

import java.util.BitSet;
/**
 *
 * @author jmlb
 */
public class DataBlockBitmapControl {
    
    int bitSize = 10;
    BitSet dbbc = new BitSet(bitSize);
    String info = "";
    
    public void fillBitSet(){
        for (int i = 0; i < info.length(); i++) {
            if(Integer.parseInt(Character.toString(info.charAt(i))) == 1){
                dbbc.set(i, true);
            }
            
        }
    }
}
