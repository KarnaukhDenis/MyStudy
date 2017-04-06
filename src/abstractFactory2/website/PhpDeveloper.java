package abstractFactory2.website;

import abstractFactory2.Developer;

/**
 * Created by Denis on 04.04.2017.
 */
public class PhpDeveloper implements Developer{
    @Override
    public void writeCode() {
        System.out.println("PHP developer write website code");
    }
}
