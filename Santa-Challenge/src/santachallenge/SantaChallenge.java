/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santachallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import santachallenge.model.Game;
import santachallenge.model.Player;
import santachallenge.view.StartProgramView;

/**
 *
 * @author Jordan
 */
public class SantaChallenge {
    private static Game currentGame = null;
    private static Player player = null;

    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;
    
    
    public static void main(String[] args) {
        
        try {
            
        SantaChallenge.inFile = new BufferedReader(new InputStreamReader(System.in));
        SantaChallenge.outFile = new PrintWriter(System.out , true);
        
        String filePath = "log.txt";
        SantaChallenge.logFile = new PrintWriter(filePath);
        
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.startProgram();
        
    } catch (Throwable te) {
        System.out.println("Exception: "+te.toString()+
                "\nCause: "+te.getCause()+
                "\nMessage: "+te.getMessage());
        
        te.printStackTrace();
        //startProgramView.startProgram();
    } finally {
            try {
               if (SantaChallenge.inFile != null) 
               SantaChallenge.inFile.close();
               
               if (SantaChallenge.outFile != null)
                SantaChallenge.outFile.close();
               
               if (SantaChallenge.logFile != null)
                SantaChallenge.logFile.close();
               
            } catch (IOException ex) {
                System.out.println("There was an error closing the file");
                return;
                 
            }
            
            
        }
}
   
    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        SantaChallenge.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        SantaChallenge.player = player;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outfile) {
        SantaChallenge.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader infile) {
        SantaChallenge.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        SantaChallenge.logFile = logFile;
    } 
}

