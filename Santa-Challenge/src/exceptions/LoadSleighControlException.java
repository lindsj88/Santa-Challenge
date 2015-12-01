/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author Lindsey
 */
public class LoadSleighControlException extends Exception {
    public LoadSleighControlException(String message) {
        super(message);
    }

    public LoadSleighControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public LoadSleighControlException(Throwable cause) {
        super(cause);
    }

    public LoadSleighControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}

