/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memoryproject;
import java.util.Collections; 
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author elafifi
 */
public class Process {
    int nPages;
    int remPages;
    int nUsedFrames;
    int Pid;
    String seq[];
    int curIp;
    Queue<Integer> queue;
    MyPair pageTable[];
    boolean status = true;  // 0 waitting  /// 1 assigned to memory frame
    int nPageFaults;
    public Process(int Pid,int nPages,String seq) {
        this.Pid = Pid;
        this.nPages = nPages;
        this.seq = seq.split(" ");
        pageTable = new MyPair[nPages+1];
        for(int i = 0;i < nPages+1;i++) {
            pageTable[i] = new MyPair(0,false);
        }
        queue = new LinkedList<Integer>();
    }
    
    
}
