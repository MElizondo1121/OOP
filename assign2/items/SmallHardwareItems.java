package assign2.items;

/**
 * CS3354 Fall 2019 Programming Assignment 2		
 * SmallHardwareItems extends Item
 * @author Mirna Elizondo
 */
public class SmallHardwareItems extends Item {

    /**
     * Constructor initializes a customer object with the provided values.
     * @param idNumber
     * @param name
     * @param quantity
     * @param price
     * @param category a <b><CODE>String</CODE></b> that represents the category.
     *                “Door&Window”, “Cabinet& Furniture”, “Fasteners”, “Structural”, “Other”.
     */
    public SmallHardwareItems(String idNumber, String name, int quantity, float price, String category) {
        super(idNumber, name, quantity, price);
        this.category = category;
    }

    /**
     * Get the category.
     * @return category
     */
    public String getCategory() {
        return category;
    }
	
    /**
     * Returns the attributes of the employee, in a formatted text fashion.
     * @return Formatted Text.
     */
    public String getFormattedText() {
        String formatLine;
        formatLine = "";// edit formatLine so it returns correct formated text here 
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
        protected final String category;
}
