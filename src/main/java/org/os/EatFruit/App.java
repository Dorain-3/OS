package org.os.EatFruit;

import lombok.experimental.FieldDefaults;

import static lombok.AccessLevel.PRIVATE;

/**
 * @author 31749
 */
@FieldDefaults(level = PRIVATE)
public class App {

    public static void main(String[] args) {

        Role father = new Role("父亲","苹果");
        Role mather=new Role("母亲","桔子");
        Role son=new Role("儿子","桔子");
        Role daughter =new Role("女儿","苹果");

        father.start();
        mather.start();
        son.start();
        daughter.start();

    }

}
