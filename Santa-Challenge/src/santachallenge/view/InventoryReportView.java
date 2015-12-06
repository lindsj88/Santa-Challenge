/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santachallenge.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
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
    
    private void displayInventoryReport() {
        
        try (PrintWriter out = new PrintWriter(outputLocation)) {
        out.println("\n\n               List of Inventory             ");
        out.printf("%n%-20s%10s%10s",   "Description",   "Quantity"    );
        out.printf("%n%-20s%10s%10s",   "-----------",   "--------"    );
       
        for (Inventory inventory : inventoryItem) {
            out.printf("%n%-20s%7d%13.2f", item.getDescription()
                                         , item.getDescription()
                                         , item.getDescription());
        }
        } catch (IOException ex) {
            this.console.println("I/O Error: " + ex.getMessage());
        }
    }
}