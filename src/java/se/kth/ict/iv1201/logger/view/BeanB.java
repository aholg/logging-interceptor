package se.kth.ict.iv1201.logger.view;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import se.kth.ict.iv1201.logger.util.Log;

/**
 * Second bean in intercepted call chain.
 */
@Log
@RequestScoped
public class BeanB {
    private @Inject BeanC beanC;

    public int doIt(boolean throwException, String param) {
        return beanC.someMethod(throwException, param);
    }
}
