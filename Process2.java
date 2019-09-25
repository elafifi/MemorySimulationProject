/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memoryproject;

/**
 *
 * @author elafifi
 */
public class Process2 {
    int pageTable[];
    int nPages;
    boolean status;
    boolean invalid;
    public Process2(int nPages) {
        this.nPages = nPages;
        pageTable = new int[nPages+1];
    }
    
}
