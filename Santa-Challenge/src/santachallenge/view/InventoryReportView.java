/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santachallenge.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import santachallenge.SantaChallenge;
import santachallenge.control.GameControl;
import santachallenge.model.Inventory;
import santachallenge.model.InventoryItem;

/**
 *
 * @author Lindsey
 */
public class InventoryReportView {

    protected final BufferedReader keyboard = SantaChallenge.getInFile();
    protected final PrintWriter console = SantaChallenge.getOutFile();
    private Writer outputLocation;
    
    private void displayInventoryReport(enum Item, String outputLocation) {
        InventoryItem[] inventory = GameControl.getInventoryList();
        
        try (PrintWriter out = new PrintWriter(outputLocation)) {
        out.println("\n\n               List of Inventory             ");
        out.printf("%n%-20s%10s%10s",   "Description",   "Quantity"    );
        out.printf("%n%-20s%10s%10s",   "-----------",   "--------"    );
       
        for (InventoryItem inventoryItem : inventory) {
            out.printf("%n%-20s%7d%13.2f", inventoryItem.getDescription()
                                         , inventoryItem.getQuantity());
        }
        } catch (GameControlException gce) {
            this.console.println("I/O Error: " + ex.getMessage());
        }
    }

    void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}