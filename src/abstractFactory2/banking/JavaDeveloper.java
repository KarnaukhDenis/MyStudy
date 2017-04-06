package abstractFactory2.banking;

import abstractFactory2.Developer;

/**
 * Created by Denis on 04.04.2017.
 */
public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer write code...");
    }
}
