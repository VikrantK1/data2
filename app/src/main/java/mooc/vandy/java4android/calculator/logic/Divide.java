package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide {
    // TODO -- start your code here
    //declare 02 properties to get 02 operands
    //the two integer values entered by the user
    private int argumentOne;
    private int argumentTwo;

    //constructors
    public Divide(int argumentOne, int argumentTwo) {
        this.argumentOne = argumentOne;
        this.argumentTwo = argumentTwo;
    }

    //define toString to return the result of operation
    @Override
    public String toString() {
        if (this.argumentTwo == 0) {
            //Your code should therefore check to prevent that
            // and instead send a text string to the screen warning of division by 0
            return "Warning: division by 0";
        }
        //calculate INT of divide operation
        int result = this.argumentOne / this.argumentTwo;
        //calculate remainder using module operation
        int remainder = this.argumentOne % this.argumentTwo;

        return result + " R: " + remainder; //output string as requirement
    }
}
