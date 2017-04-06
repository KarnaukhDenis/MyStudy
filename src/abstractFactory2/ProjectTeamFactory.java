package abstractFactory2;

/**
 * Created by Denis on 04.04.2017.
 */
public interface ProjectTeamFactory {
    Developer getDeveloper();
    Tester getTester();
    ProjectManager getProjectManager();
}
