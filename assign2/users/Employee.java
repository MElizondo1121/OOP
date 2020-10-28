package assign2.users;

/**
 * CS3354 Fall 2019 Programming Assignment 2		
 * Employee is a subclass of User
 * @author Mirna Elizondo
 */
public class Employee extends User {

    /**
     * Constructor initializes an employee object with the provided values.
     * @param id
     * @param firstName
     * @param lastName
     * @param socialSecurityNumber
     * @param monthlySalary
     */
    public Employee(int id, String firstName, String lastName, int socialSecurityNumber, float monthlySalary) {
        super(id, firstName, lastName);
        this.socialSecurityNumber = socialSecurityNumber;
        this.monthlySalary = monthlySalary;//constructor added
    }

    /**
     * Get the SSN.
     * @return socialSecurityNumber
     */
    public int getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    /**
     * Set the SSN.
     * @param socialSecurityNumber
     */
    public void setSocialSecurityNumber(int socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    /**
     * Get the monthly salary.
     * @return monthlySalary
     */
    public float getMonthlySalary() {
        return monthlySalary;
    }

    /**
     * Set the monthly salary.
     * @param monthlySalary
     */
    public void setMonthlySalary(float monthlySalary) {
        this.monthlySalary = monthlySalary;
    }


    /**
     * Returns the attributes of the employee, in a formatted text fashion.
     * @return Formatted Text.
     */
    public String getFormattedText() {
	String formatLine;
	formatLine = "";//formatLine so it returns correct formated text here 
        return formatLine;
    }

    /**
     * Get information to be shown in JTable
     * @return String array of information
     */
    public String[] getJTableEntry() {
	String[] formatArray = {"hi", "bye"}; //add array of information to be displayed in JTable
        return formatArray;
    }
		
    private int socialSecurityNumber;
    private float monthlySalary;
	
}
