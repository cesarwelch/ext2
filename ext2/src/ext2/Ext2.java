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
public class Ext2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        fileSystemManager man = new fileSystemManager();
        man.write("Hola que tal como vamos?", 0);
        man.write("94546649",25);
        man.write("99900000", 33);
        System.out.println(man.read(0, 24));
        System.out.println(man.read(25, 8));
        System.out.println(man.read(33, 8));
        System.out.println(man.read(0, 41));
    }
    
}
