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
public class ContigousVM {
    public static final int MEM_SIZE = 100000;
    int mem[] = new int[MEM_SIZE];
    int cur = 0;
    public void execute(Process1 p) {
        if(p.size<=MEM_SIZE-cur)
        {
            p.status = true;
            p.start = cur;
            for(int i = cur;i<cur+p.size;i++){
            mem[i] = p.Pid;
        }
            cur += p.size;
        }else {
            if(p.size>MEM_SIZE)
                p.isCanceled = true;
            else p.status = false;
        }
        
    }
    
    
}
