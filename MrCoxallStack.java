/*
* This program is a stack class.
*
* @author  Ahmad El-khawaldeh
* @version 1.0
* @since   2021-12-07
*/

import java.util.ArrayList;

/**
 * MrCoxallStack.
 */
public class MrCoxallStack {
    /**
    * Stack variable.
    */
    private ArrayList<Object> stack = new ArrayList<Object>();

    /**
    * Function adds value to stack.
    *
    * @param pushValue discription.
    */
    public void push(final Object pushValue) {
            stack.add(0, pushValue);
    }

    /**
    * Prints stack.
    */
    public void showStack() {
        for (int counter = 0; counter < stack.size(); counter++) {
            System.out.println(stack.get(counter));
        }
    }

    /**
    * Pop stack.
    *
    * @return returnValue good.
    */
    public Object pop() {
        final Object returnValue;
        if (stack.size() > 0) {
            returnValue = stack.get(0);
            stack.remove(0);
        } else {
            returnValue = null;
        }
        return returnValue;
    }
}
