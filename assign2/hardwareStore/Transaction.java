package assign2.hardwareStore;

import java.io.Serializable;
import java.util.Date;

/**
 * CS3354 Fall 2019 Programming Assignment 2		
 * Customer is a subclass of User
 * @author Mirna Elizondo
 */
public class Transaction {
    private final String itemID;
    private final Date saleDate;
    private final int saleQuantity;
    private final int customerId;
    private final int employeeId;

    /**
     * Constructor initializes a SaleTransaction object with the provided values.
     * @param itemID
     * @param saleDate
     * @param saleQuantity
     * @param customerId
     * @param employeeId
     */
    public Transaction(String itemID, Date saleDate, int saleQuantity, int customerId, int employeeId) {
        this.itemID = itemID;
        this.saleDate = saleDate;
        this.saleQuantity = saleQuantity;
        this.customerId = customerId;
        this.employeeId = employeeId;
    }

    /**
     * Get the item ID of this transaction.
     * @return itemID
     */
    public String getItemID() {
        return itemID;
    }

    /**
     * Get the sale date of this transaction.
     * @return saleDate
     */
    public Date getSaleDate() {
        return saleDate;
    }

    /**
     * Get the sale quantity of this transaction.
     * @return saleQuantity
     */
    public int getSaleQuantity() {
        return saleQuantity;
    }

    /**
     * Get the customer ID of this transaction.
     * @return customerId
     */
    public int getCustomerId() {
        return customerId;
    }

    /**
     * Get the employee ID of this transaction.
     * @return
     */
    public int getEmployeeId() {
        return employeeId;
    }


    public String getFormattedText() {
        
    return "boo";
    }
    @Override
    public String toString() {
       String info = "~ ";
       info = info + String.format("%6s", this.getItemID() + " ~ ");
       info = info + String.format("%6s", this.getSaleDate() + " ~ ");
       info = info + String.format("%6s", this.getCustomerId() + " ~ ");
       info = info + String.format("%6s", this.getEmployeeId() + " ~ ");
    return info;
    }
}

