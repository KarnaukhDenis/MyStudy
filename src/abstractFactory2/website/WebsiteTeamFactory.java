package abstractFactory2.website;

import abstractFactory2.Developer;
import abstractFactory2.ProjectManager;
import abstractFactory2.ProjectTeamFactory;
import abstractFactory2.Tester;


public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebSitePM();
    }
}
