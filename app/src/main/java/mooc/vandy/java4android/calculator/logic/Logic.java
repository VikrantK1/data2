package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.logic.Add;
import mooc.vandy.java4android.calculator.logic.Divide;
import mooc.vandy.java4android.calculator.logic.Multiply;
import mooc.vandy.java4android.calculator.logic.Subtract;
import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic 
       implements LogicInterface {
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out){
        mOut = out;
    }

    //define constant to determine operation need process
    // the operation to perform, where the value
    // 1=addition, 2=subtraction, 3=multiplication, and 4=division.
    private static final int ADDITION = 1;
    private static final int SUBTRACTION = 2;
    private static final int MULTIPLICATION = 3;
    private static final int DIVISION = 4;

    /**
     * Perform the @a operation on @a argumentOne and @a argumentTwo.
     */
    public void process(int argumentOne,
                        int argumentTwo,
                        int operation){
        // TODO -- start your code here
        String result = "";//get result of calculating
        switch(operation) {//check operation is call
            case ADDITION:
                Add add = new Add(argumentOne, argumentTwo);
                result = add.toString();
                break;
            case SUBTRACTION:
                Subtract subtract = new Subtract(argumentOne, argumentTwo);
                result = subtract.toString();
                break;
            case MULTIPLICATION:
                Multiply multiply = new Multiply(argumentOne, argumentTwo);
                result = multiply.toString();
                break;
            case DIVISION:
                Divide divide = new Divide(argumentOne, argumentTwo);
                result = divide.toString();
                break;
                default:
                    result = "No operation is matched!!!";
        }//end switch of operation to trigger
        mOut.print(result); // print a string that contains the final answer
        // in the expected form. out.print(String)
    }
}
