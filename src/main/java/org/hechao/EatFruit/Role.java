package org.hechao.EatFruit;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Role extends Thread {

    private String role;

    private String fruit;

    @Override
    public void run() {
        try {
            while (true) {
                Disk disk = Disk.getDisk();
                if (("父亲".equals(role) || "母亲".equals(role))) {
                    disk.getIsEmpty().acquire();
                    disk.put(role, fruit);
                    sleep(1000);
                    disk.release(role, fruit);
                } else if ("儿子".equals(role) || "女儿".equals(role)) {
                    disk.acquire(role, fruit);
                    sleep(1000);
                    disk.eat(role, fruit);
                    disk.getIsEmpty().release();
                }
            }
        } catch (InterruptedException ignored) {

        }
    }

}
