/**
 * Created by Anne Murphy on 17/11/2020
 */
public class Projects {
    private static int nextProjectId = 0;

    private int projectId;
    private String projectName;
    private double projectBudget;

    public Projects(String name, double budget){
        this.projectName = name;
        this.projectBudget = budget;
        this.projectId = nextProjectId++;
    }

    public String getProjectName() {
        return this.projectName;
    } //getProjectName

    public double getProjectBudget () {
        return this.projectBudget;
    } //getProjectBudget

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    } //setProjectName

    public void setProjectBudget(double projectBudget) {
        this.projectBudget = projectBudget;
    }//setProjectBudget

    public int getProjectId() {
        return projectId;
    }

}//class

