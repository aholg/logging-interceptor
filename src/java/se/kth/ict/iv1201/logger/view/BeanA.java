package se.kth.ict.iv1201.logger.view;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import se.kth.ict.iv1201.logger.util.Log;

/**TESTEST
 * Firparamt bean in intercepted call chain.
 */
@Log
@Named("beanA")
@RequestScoped
public class BeanA {
    private @Inject
    BeanB beanB;
    private boolean throwException;
    private String param;

    public boolean isThrowException() {
        return throwException;
    }

    public void setThrowException(boolean throwException) {
        this.throwException = throwException;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public void doIt() {
        //try {
            beanB.doIt(throwException, param);
        //} catch (Throwable expected) {
       // }
    }
}
