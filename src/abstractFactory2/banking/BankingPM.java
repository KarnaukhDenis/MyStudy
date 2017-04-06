package abstractFactory2.banking;

import abstractFactory2.ProjectManager;


public class BankingPM implements ProjectManager {

    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking project...");

    }
}
