package assign2.users;

/**
 * CS3354 Fall 2019 Programming Assignment 2		
 * Customer is a subclass of User
 * @author Mirna Elizondo
 */
public class Customer extends User {

    /**
     * Constructor initializes a customer object with the provided values.
     * @param id
     * @param phoneNumber
     * @param address
     * @param firstName
     * @param lastName
     */
    public Customer(int id, String firstName, String lastName, String phoneNumber, String address) {
       super(id, firstName, lastName);
       this.phoneNumber = phoneNumber;
       this.address = address;//constructor added
    }

    /**
     * Get the phone number.
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Set the phone number.
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Get the address.
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Set the address.
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }
    
    /**
     * Returns the attributes of the customer, in a formatted text fashion.
     * @return Formatted Text.
     */
    public String getFormattedText() {
      	String formatLine;
	formatLine = ("Phone number: " + phoneNumber + "Address: " + address);// edit formatLine so it returns correct formated text here 
        return formatLine;
    }
	
    /**
     * Get information to be shown in JTable
     * @return String array of information
     */
    public String[] getJTableEntry() {
	String[] formatArray = {}; //add array of information to be displayed in JTable
        return formatArray;
    }
	
    private String phoneNumber;
    private String address;

}
