package badcode;

import java.util.logging.Level;
import java.util.logging.Logger;


public class MyBadCode {

    private static final Logger logger = Logger.getLogger(MyBadCode.class.getName());

    public static void main(String[] args) {

        Long inputA = Long
                .valueOf(1);
        Long
                inputB = Long.valueOf(2);

        if (true == (inputA == inputB)) {
                    executeMethod();
executeMethod();
        } else {


logger.log(Level.INFO, "Inputs are" +
            "different");
        }
    }

    private static void executeMethod() {
        logger.log(Level.INFO, "Dummy method " +
                "execution");
    }

}
