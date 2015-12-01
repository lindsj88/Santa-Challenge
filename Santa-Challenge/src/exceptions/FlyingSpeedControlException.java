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
public class FlyingSpeedControlException extends Exception {

    public FlyingSpeedControlException(String message) {
        super(message);
    }

    public FlyingSpeedControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public FlyingSpeedControlException(Throwable cause) {
        super(cause);
    }

    public FlyingSpeedControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
