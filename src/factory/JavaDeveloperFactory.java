package factory;

/**
 * Created by Denis on 04.04.2017.
 */
public class JavaDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
