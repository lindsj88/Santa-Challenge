/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santachallenge.view;

import java.io.PrintWriter;
import santachallenge.SantaChallenge;

/**
 *
 * @author Lindsey
 */
public class ErrorView {
    private static final PrintWriter errorFile = SantaChallenge.getOutFile();
    private static final PrintWriter logFile = SantaChallenge.getLogFile();
    public static void display (String className, String errorMessage){
        errorFile.println(
         "-----------------------------------------------------------------"
        +"\n  Error: " + errorMessage
        +"\n-----------------------------------------------------------------");
        
        logFile.println(className + " - " + errorMessage);
    }
}