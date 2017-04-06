package abstractFactory2.website;

import abstractFactory2.ProjectManager;

/**
 * Created by Denis on 04.04.2017.
 */
public class WebSitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages Website project...");
    }
}
