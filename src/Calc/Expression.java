/**
 * Expression.java (interface)
 *
 * This is a simple interface to specify an
 * "expression" for String -> Math parsing
 *
 * To conform to this interface, a class
 * must implement an "eval" method, that
 * returns a double.
 */
package Calc;

public interface Expression {

    double eval();
}
