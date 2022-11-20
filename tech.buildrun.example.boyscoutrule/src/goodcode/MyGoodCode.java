package goodcode;

import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyGoodCode {

    private static final Logger logger = Logger.getLogger(MyGoodCode.class.getName());

    public static void main(String[] args) {

        var inputA = 1L;
        var inputB = 2L;

        if (Objects.equals(inputA, inputB)) {
            executeMethod();
            executeMethod();
        } else {
            logger.log(
                    Level.INFO,
                    "Inputs are different");
        }
    }

    private static void executeMethod() {
        logger.log(Level.INFO, "Dummy method " +
                "execution");
    }

}
