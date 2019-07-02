package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply {
    // TODO -- start your code here
    //declare 02 properties to get 02 operands
    //the two integer values entered by the user
    private int argumentOne;
    private int argumentTwo;

    //constructors
    public Multiply(int argumentOne, int argumentTwo) {
        this.argumentOne = argumentOne;
        this.argumentTwo = argumentTwo;
    }

    //define toString to return the result of operation
    @Override
    public String toString() {
        int result = this.argumentOne * this.argumentTwo;

        return result + "";
    }
}
