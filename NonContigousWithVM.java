/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memoryproject;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author elafifi
 */
public class NonContigousWithVM {

    private static final int MAX_NO_FRAMES_PER_PROCESS = 5;
    int memory[] = new int[100];
    public Queue<Integer> freeFramList = new LinkedList<Integer>();

    public NonContigousWithVM() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 100; j += 10) {
                freeFramList.add(i + j);
            }
        }
    }

    public void swap(Process p) {
        int curIp = p.curIp;
        int newPage = (int) Integer.valueOf(p.seq[curIp]);
        System.out.println(newPage);
        if (p.pageTable[newPage].isValid) {
            for (int i = 0; i < p.nUsedFrames; i++) {
                int page = p.queue.remove();
                if (page != newPage) {
                    p.queue.add(page);
                }
            }
            p.queue.add(newPage);
            p.curIp++;
        } else if (p.nUsedFrames < MAX_NO_FRAMES_PER_PROCESS && freeFramList.size() > 0) {
            p.status = true; // process assigned to memory
            int curFrame = freeFramList.remove();
            p.nUsedFrames++;
            p.queue.add(newPage);
            p.curIp++;
            p.pageTable[newPage].frameNumber = curFrame;
            p.pageTable[newPage].isValid = true;
            memory[curFrame] = newPage;
            p.nPageFaults++;
        } else if (p.nUsedFrames > 0) {
            int page = p.queue.remove();
            int frame = p.pageTable[page].frameNumber;
            p.pageTable[page].isValid = false;
            p.pageTable[newPage].frameNumber = frame;
            p.pageTable[newPage].isValid = true;
            p.queue.add(newPage);
            memory[frame] = newPage;
            p.nPageFaults++;
            p.curIp++;

        } else {
            p.status = false;
        }
    }

}
