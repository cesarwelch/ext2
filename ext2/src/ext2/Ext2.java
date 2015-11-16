/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ext2;

import java.util.Random;

/**
 *
 * @author Cesar
 */
public class Ext2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        fileSystemManager man = new fileSystemManager();
        man.write("¿Hola que tal como vamos?", 0);
        man.write("94546649",25);
        man.write("99900000", 33);
        String bmp = "";
        Random randomGenerator = new Random();
        for (int idx = 1; idx <= 9216; ++idx){
          int randomInt = randomGenerator.nextInt(2);
          bmp += randomInt;
        }
        System.out.println(bmp.length());
        man.setDataBlockBitmap(bmp);
        System.out.println(man.getDataBlockBitmap());
        System.out.println(man.getDataBlockBitmap().length());
        System.out.println(man.read(0, 24));
        System.out.println(man.read(25, 8));
        System.out.println(man.read(33, 8));
        System.out.println(man.read(0, 41));
    }
    
}
