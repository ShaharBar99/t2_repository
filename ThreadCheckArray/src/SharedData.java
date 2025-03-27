import java.util.ArrayList;

/**
 * The {@code SharedData} class represents a shared data structure
 * that holds an array of integers, a win-state boolean array,
 * a flag, and a constant integer value.
 */
public class SharedData {
    
    /** The list of integers to be shared. */
    private ArrayList<Integer> array;

    /** A boolean array indicating win states. */
    private boolean[] winArray;

    /** A general-purpose flag. */
    private boolean flag;

    /** A constant integer value. */
    private final int b;

    /**
     * Constructs a new {@code SharedData} object with the given array and constant.
     *
     * @param array the list of integers
     * @param b the constant integer value
     */
    public SharedData(ArrayList<Integer> array, int b) {
        this.array = array;
        this.b = b;
    }

    /**
     * Returns the win-state boolean array.
     *
     * @return the win array
     */
    public boolean[] getWinArray() {
        return winArray;
    }

    /**
     * Sets the win-state boolean array.
     *
     * @param winArray the new win array
     */
    public void setWinArray(boolean[] winArray) {
        this.winArray = winArray;
    }

    /**
     * Returns the list of integers.
     *
     * @return the integer array list
     */
    public ArrayList<Integer> getArray() {
        return array;
    }

    /**
     * Returns the constant integer value.
     *
     * @return the value of {@code b}
     */
    public int getB() {
        return b;
    }

    /**
     * Returns the current value of the flag.
     *
     * @return {@code true} if the flag is set, {@code false} otherwise
     */
    public boolean getFlag() {
        return flag;
    }

    /**
     * Sets the value of the flag.
     *
     * @param flag the new flag value
     */
    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
