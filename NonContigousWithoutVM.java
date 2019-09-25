/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memoryproject;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 *
 * @author elafifi
 */
public class NonContigousWithoutVM {

    int memory[] = new int[100];
    boolean vis[] = new boolean[110];
    public Queue<Integer> freeFramList = new LinkedList<Integer>();

    public NonContigousWithoutVM() {
        while (freeFramList.size() < 100) {
            int num = (int) (Math.random() * 100);

            if (!vis[num]) {
                vis[num] = true;
                freeFramList.add(num);
            }

        }
    }

    public void executeP(Process2 p) {
        if (p.nPages > 100) {
            p.invalid = true;
        } else if (freeFramList.size() >= p.nPages) {
            for (int i = 0; i < p.nPages; i++) {
                int frameNum = freeFramList.remove();
                System.out.println(frameNum);
                memory[frameNum] = i;
                p.pageTable[i] = frameNum;
            }
            p.status = true;
        }

    }

}
