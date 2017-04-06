package abstractFactory2.banking;

import abstractFactory2.Developer;
import abstractFactory2.ProjectManager;
import abstractFactory2.ProjectTeamFactory;
import abstractFactory2.Tester;


public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
