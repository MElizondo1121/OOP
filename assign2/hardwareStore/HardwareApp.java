package assign2.hardwareStore; 

import assign2.items.*;
import assign2.hardwareStore.Transaction;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.io.IOException;
import java.util.*;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.*;
import javax.swing.table.*;





/**
 * Hardware Store database manager. 
 * @author Mirna Elizondo
 */
public class HardwareApp extends JFrame{

    private static HardwareStore hws;


	/** Run the app on UI thread 
	  * @param args array of string arguments 
	*/
	public static void main(String[] args) throws IOException {
            
            HardwareStore hws = new HardwareStore();
            hws.readDatabase();
            createAndShowGUI();

        ;
    }
    
    /**
     * This method initialize the top panel, which is the commands using a ComboBox
     */
    private static void createTopPanel(){
        
        comboBox.addItem("Please select...");
        comboBox.addItem(" 1. Show all existing items records in the database (sorted by ID number).");
        comboBox.addItem(" 2. Add new item (or quantity) to the database.");
        comboBox.addItem(" 3. Delete an item from a database.");
        comboBox.addItem(" 4. Search for an item given its name.");
        comboBox.addItem(" 5. Show a list of users in the database.");
        comboBox.addItem(" 6. Add new user to the database.");
        comboBox.addItem(" 7. Update user info (given their id).");
        comboBox.addItem(" 8. Complete a sale transaction.");
        comboBox.addItem(" 9. Show completed sale transactions.");
        comboBox.addItem("10. Exit program.");
        comboBox.setSelectedIndex(0);
        comboBox.setEditable(false);
        
        comboBox.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            String choice1 = (String) comboBox.getSelectedItem();
            if (choice1.equals(" 1. Show all existing items records in the database (sorted by ID number).")){
                showAllItems();
            } else if (choice1.equals(" 2. Add new item (or quantity) to the database.")){
                addItemQuantity();
            } else if (choice1.equals(" 3. Delete an item from a database.")){
                removeItem();
            } else if (choice1.equals(" 4. Search for an item given its name.")){
                searchItemByName();
            } else if (choice1.equals(" 5. Show a list of users in the database.")){
                showAllUsers();
            } else if (choice1.equals(" 6. Add new user to the database.")) {
                editUser();
            } else if (choice1.equals(" 7. Update user info (given their id).")){
                finishTransaction();
            } else if (choice1.equals(" 8. Complete a sale transaction.")) {
                showAllTransactions();
            } else if (choice1.equals(" 9. Show completed sale transactions.")){
                showAllTransactions();
            } else if (choice1.equals("10. Exit program.")){
            } else {
                System.out.println("Make a choice");
            }
        }
        });
        done.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                console.getText();
            }
        });

        

    }


    /**
     * This method initialize the bottom panel, which is the output area.
     * Just a TextArea that not editable.
     */
    private static void createBottomPanel(){
        String[][] data = new String[search.size()][6];

        String[] cNames = {"Item ID:", "Sale date:", "Sale Quantity:", "Customer Id:", "Employee Id: "};
        
        for (int i = 0; i < search.size(); i++) {
            data[i][0] = String.valueOf((search.get(i).getIdNumber()));
            data[i][1] = String.valueOf((search.get(i).getSaleDate()));
            data[i][2] = String.valueOf(search.get(i).getIdNumber());
            data[i][3] = String.valueOf(search.get(i).getIdNumber());
        }JTable table = new JTable(data, cNames);
        
         table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
;
    };

    /**
     * Initialize the JFrame and JPanels, and show them.
     * Also set the location to the middle of the monitor. (done)
     */
    private static void createAndShowGUI() throws IOException {
        HardwareApp hwa = new HardwareApp();
        JFrame frame = new JFrame("Hardware App");
        createTopPanel();
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout());
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new FlowLayout());
        topPanel.add(comboBox);
        JScrollPane sCons = new JScrollPane(console);
        sCons.setSize(frame.getSize());
        JTextArea console = new JTextArea();
        console.setSize(frame.getSize());     
        console.setLineWrap(true);
        console.setEditable(true);
        
        
        JTable table = new JTable();
        JScrollPane scroll = new JScrollPane(table);
        createBottomPanel();
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        bottomPanel.add(scroll);
               
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(bottomPanel, BorderLayout.SOUTH);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        //sets window in center of monitor
        frame.setSize(600,500);
        frame.setLocationRelativeTo(null);
        frame.setResizable(true);
        
        
                

        
        //implement 
    }


    //Function 1
    /**
     * This method shows all items in the inventory.
     */
    public static void showAllItems(){
       createBottomPanel();
    }


    //Function 2
    /**
     * This method will add items quantity with given number. If the item does
     * not exist, it will call another method to add it.
     *
     */
    public static void addItemQuantity() {
	        //implement
    }

    //Function 3
    /**
     * This method will remove the item with given ID.
     * If the item does not exist, it will show an appropriate message.
     */
    public static void removeItem() {
	 
    }

    //Function 4
    /**
     * This method can search item by a given name (part of name.
     * Case-insensitive.) Will display all items with the given name.
     */
    public static void searchItemByName() {
		//implement 
    }

    //Function 5
    /**
     * This method shows all users in the system.
     */
    public static void showAllUsers() {
		//implement
    }

    //Function 7
    /**
     * This method will edit a user (customer or employee).
     *
     */
    public static void editUser() {
		//implement

    }

    //Function 8
    /**
     * This method will lead user to complete a transaction.
     */
    public static void finishTransaction(){
		//implement
    }

    //Function 9
    /**
     * This method shows all transactions in the system.
     */
    public static void showAllTransactions(){
		//implement
    }

    //Function 10
    /**
     * These method is called to save the database before exit the system.
     * @throws IOException
     */
    public static void saveDatabase(){
		
    }
	
	
	// This does not have to be a complete list of variables 
	
    //Database
    private static HardwareStore hardwareStore;

    //width and height of the monitor
    private static int width = Toolkit.getDefaultToolkit().getScreenSize().width;
    private static int height = Toolkit.getDefaultToolkit().getScreenSize().height;

    //Add components for the layout
    static JPanel topPanel = new JPanel();
    static JPanel bottomPanel = new JPanel();
    private static ArrayList<Item> search = new ArrayList<>();
    private static ArrayList<Item> dataItems = new ArrayList();
    private static ArrayList<Item> items = new ArrayList();
    
    static private final JComboBox comboBox = new JComboBox();
    static private final JTextArea console = new JTextArea();
    static private final JButton done = new JButton();
    static private final JFrame frame = new JFrame();
    static JTable table = new JTable();
    static private String filePath;
    static private Vector data;
    static private Vector columns;
}
