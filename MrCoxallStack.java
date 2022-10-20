/*
* This file pushes to, peeks and prints a stack.
*
* @author  Aidan Lalonde-Novales
* @version 1.0
* @since   2022-10-20
*/

import java.util.ArrayList;

/**
 * Stack Class.
 */
public class MrCoxallStack {
    /**
     * Creates an Array Stack.
     */
    private ArrayList<Float> stack = new ArrayList<Float>();

    /**
     * This method is the getter, showing items to the user.
     *
     * @return stack - array being added to.
     */
    public ArrayList<Float> getStack() {
        return stack;
    }

    /**
     * This method adds a number to the stack.
     *
     * @param tempNum - number to be pushed to the stack.
     */
    public void pushStack(float tempNum) {
        stack.add(tempNum);
    }

    /**
     * This method pops the most recent value from the stack.
     *
     * @return popOutput - the popped output from the stack.
     */
    public float popStack() {
        final float popOutput;
        if (stack.isEmpty()) {
            popOutput = 0;
        } else {
            popOutput = stack.remove(stack.size() - 1);
        }
        return popOutput;
    }

    /**
     * This method allows the user to view the
     * most recent number in the stack.
     *
     * @return peekOutput - the peek output from the stack.
     */
    public float peekStack() {
        final float peekOutput;
        if (stack.isEmpty()) {
            peekOutput = 0;
        } else {
            peekOutput = stack.get(stack.size() - 1);
        }
        return peekOutput;
    }
}
