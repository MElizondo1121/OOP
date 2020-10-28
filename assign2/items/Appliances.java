package assign2.items;

import assign2.items.Item;

/**
 * CS3354 Fall 2019 Programming Assignment 2		
 * Appliances is a subclass of User
 * @author Mirna Elizondo
 */
public class Appliances extends Item {

    /**
     * Constructor initializes a customer object with the provided values.
     * @param idNumber
     * @param name
     * @param quantity
     * @param price
     * @param brand
     * @param type a <b><CODE>String</CODE></b> that represents the type.
     *                "Refrigerators", "Washers&Dryers", "Ranges&Ovens", "Small Appliance".
     */
    public Appliances(String idNumber, String name, int quantity, float price, String brand, String type){
        super(idNumber, name, quantity, price);
        this.brand = brand;
        this.type = type;//constructor here 
    }

    /**
     * Get the brand.
     * @return brand
     */
    public String getBrand() {
        return brand;
    }


    /**
     * Get the type.
     * @return type
     */
    public String getType() {
        return type;
    }
	
	    /**
     * Returns the attributes of the employee, in a formatted text fashion.
     * @return Formatted Text.
     */
    public String getFormattedText() {
	String formatLine;
	formatLine = "";	// edit formatLine so it returns correct formated text here 
        return formatLine;
    }

    /**
     * Get information to be shown in JTable
     * @return String array of information
     */
    public String[] getJTableEntry() {
	String[] formatArray = {brand, type};//add array of info to be displayed in JTable
        return formatArray;
    }
	
    protected final String brand;
    protected final String type;

}
