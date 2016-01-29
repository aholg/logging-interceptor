package se.kth.ict.iv1201.logger.view;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import se.kth.ict.iv1201.logger.util.Log;

/**
 * Third bean in intercepted call chain.
 */
@Log
@RequestScoped
public class BeanC {
    public int someMethod(boolean throwException, String s) {
        if (throwException) {
            throw new RuntimeException("Testing exceptions"); 
        }
        return s.length();
    }
}
