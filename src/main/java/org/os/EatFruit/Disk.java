package org.os.EatFruit;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.concurrent.Semaphore;

@AllArgsConstructor
@Data
public class Disk {

    //1 Empty
    private Semaphore isEmpty;

    private Semaphore orange;

    private Semaphore apple;

    private static final Disk disk = new Disk();

    private Disk() {
        this.isEmpty = new Semaphore(1);
        this.orange = new Semaphore(0);
        this.apple = new Semaphore(0);
    }

    public static Disk getDisk() {
        if (disk == null) {
            return new Disk();
        }
        return disk;
    }

    public void put(String role, String fruitName) {
        System.out.println(role + "往盘子里放入了一个" + fruitName);
    }

    public void release(String role, String fruitName) {
        if ("父亲".equals(role)) {
            apple.release();
        } else {
            orange.release();
        }
    }

    public void acquire(String role, String fruitName) throws InterruptedException {
        if ("儿子".equals(role)) {
            orange.acquire();
        } else {
            apple.acquire();
        }
    }

    public void eat(String role, String fruitName) {
        System.out.println(role + "吃了一个" + fruitName);
    }


}
