/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memoryproject;

import java.util.LinkedList;
import javax.swing.JFrame;

/**
 *
 * @author elafifi
 */
public class MemoryProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Process2 p = new Process2(5);
        NonContigousWithoutVM VM = new NonContigousWithoutVM();
        VM.executeP(p); 
        for(int i = 0;i<p.nPages;i++) {
            System.out.println(i+ " " + p.pageTable[i]);
        }
        
    }

}
