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
public class Process1 {
    boolean status; // status 0 ===>wating    //// status 1 ===> finished
    boolean isCanceled; // isCanceled 0 ==> no /// isCanceled 1 ===> canceled
    int Pid;
    int start;
    int size;
    public Process1(int Pid,int size) {
     this.Pid = Pid;
     this.size = size;
    }
    
}
