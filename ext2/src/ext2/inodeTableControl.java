/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ext2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author jmlb
 */
public class inodeTableControl {
    
    inode node = new inode();
    String[] arr = null;
    DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    int[] arr2 = null;
    int inicio = 101;
    int fin = 105;
    
    public void parse(String s) throws ParseException{
        arr[0] = s.substring(0, 2);
        arr[1] = s.substring(3, 5);
        node.setI_mode(arr);
        node.setI_uid(s.substring(6, 7));
        node.setI_size(Integer.parseInt(s.substring(8, 16)));
        node.setI_atime(df.parse(s.substring(17, 35)));
        node.setI_ctime(df.parse(s.substring(36, 52)));
        node.setI_mtime(df.parse(s.substring(53, 71)));
        node.setI_dtime(df.parse(s.substring(72, 90)));
        node.setI_gid(s.substring(91, 92));
        node.setI_links_count(Integer.parseInt(s.substring(93, 94)));
        node.setI_blocks(Integer.parseInt(s.substring(95, 100)));
        for (int i = 0; i < 11; i++) {
            arr2[i] = Integer.parseInt(s.substring(inicio, fin));
            inicio += 6;
            fin += 6;
        }
        node.setI_block(arr2);
        node.setIndirect_block_pointer(Integer.parseInt(s.substring(173, 178)));
    }
    
}
