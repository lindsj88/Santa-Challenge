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
public class FeedSantaControlException extends Exception {

    public FeedSantaControlException() {
    }

    public FeedSantaControlException(String message) {
        super(message);
    }

    public FeedSantaControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public FeedSantaControlException(Throwable cause) {
        super(cause);
    }

    public FeedSantaControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
