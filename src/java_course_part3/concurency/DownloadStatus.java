package java_course_part3.concurency;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DownloadStatus {


    private volatile boolean isDone;
    private int totalBytes;
//    private AtomicInteger totalBytes = new AtomicInteger();
    private int totalFiles;

    public int getTotalBytes() {
        return totalBytes;
    }



    public void incrementTotalBytes() {
        totalBytes++;
    }

    public void incremeentTotalFiles() {
//        synchronized (totalFilesLock) {
            totalFiles++;
//        }
    }
    public int getTotalFiles() {
        return totalFiles;
    }
    public boolean isDone() {
        return isDone;
    }
    public void done() {
        isDone = true;
    }
}
