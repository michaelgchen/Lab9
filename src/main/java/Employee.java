/**
 * Class implementing an employee.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/9/">Lab 9 Description</a>
 */
public class Employee {

    /**
     * name = name of the employee.
     */
    private String name;
    /**
     * manager = name of the manager.
     */
    private String manager;

    /**
     * Constructor for initialization.
     * @param setName is the name of the employee
     * @param setManager is the name of the manager
     */
    public Employee(final String setName, final String setManager) {
        this.name = name;
        this.manager = manager;
    }

    /**
     * Getter for name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name.
     * @param setName is the name of the employee
     */
    public void setName(final String setName) {
        this.name = name;
    }

    /**
     * Getter for manager.
     * @return manager
     */
    public String getManager() {
        return manager;
    }

    /**
     * Setter for manager.
     * @param setManager is the name of the manager
     */
    public void setManager(final String setManager) {
        this.manager = manager;
    }
}
