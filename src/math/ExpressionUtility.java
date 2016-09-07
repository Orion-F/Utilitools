package math;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class containing static methods for solving mathematical expressions
 * 
 * @author Orion
 * @version 1.1.0
 */
public class ExpressionUtility {
    
    /*      TODO
     * Create classes for errors and implement an error handling system
     * Perhaps make a class for an individual expression
     *          Can then have methods for appending, replacing, etc.
     * Create a dynamic String-double usage system so that better values can be used 
     * instead of rounding
     * Add functionality for accepting exponents
     * Create additional parameters for the solve method that can be used to specify 
     * how the expression should be processed. (Create a options enum)
     *     - Option for how to process exponents
     *     - Option for errors
     *     - Option for formating
     * Ability to preserve formating
     */
    
    //Parenthesis handling system seems to work after basic testing
    
    /**
     * Solves a given mathematical expression. Accepts addition, subtraction,
     * multiplication, division, and parentheses. Does not currently accept 
     * exponents.
     * 
     * @param expr a String of the expression to solve
     * @return a double of the value of the solved expression
     */
    public static double solve(String expr) {
        expr = preFormat(expr);
        
        int leftParenCount = 0;
        for (int i = 0; i < expr.length(); i++)
            if (expr.charAt(i) == '(') leftParenCount++;
        int rightParenCount = 0;
        for (int i = 0; i < expr.length(); i++)
            if (expr.charAt(i) == ')') rightParenCount++;
        if (leftParenCount != rightParenCount) {
            //TODO: Log parentheses error
        }
        
        int leftParen = -1;
        int rightParen = -1;
        while (expr.contains("(") || expr.contains(")")) {
            boolean test = true;
            for (int i = 0; i < expr.length() && test; i++) {
                if (expr.charAt(i) == '(')
                    leftParen = i;
                if (expr.charAt(i) == ')') {
                    rightParen = i;
                    expr = expr.substring(0, leftParen) + 
                            solvePartWithoutParentheses(expr.substring(leftParen + 1, rightParen)) +
                            expr.substring(rightParen + 1);
                    test = false;
                }
            }
        }
        return solvePartWithoutParentheses(expr);
    }
    
    /**
     * Replaces characters in the expression that are incompatible with the solver
     * (e.g. spaces, redundant addition/subtraction signs, different styles for characters)
     * 
     * @param expr a String of the expression to format
     * @return a String of the the formatted expression
     */
    private static String preFormat(String expr) {
        expr = expr.replaceAll("\\s+", "");
        expr = expr.replaceAll("(\\+\\+|--)", "\\+");
        expr = expr.replaceAll("(\\+-|-\\+)", "-");
        expr = expr.replaceAll("x", "\\*");
        expr = expr.replaceAll("×", "\\*");
        expr = expr.replaceAll("⋅", "\\*");
        expr = expr.replaceAll("÷", "/");
        return expr;
    }
    
    /**
     * Solves an expression that does not contain parentheses.
     * Used for solving each parentheses block in the full expression.
     * 
     * @param expr a String of the expression to solve
     * @return a double of the value of the solved expression
     */
    private static double solvePartWithoutParentheses(String expr) {
        double exprSolved = 0;
        for (String term : expr.split("(?<=\\d)(?=[+-])")) {
            double termTotal = 0;
            if (term.matches(".*[*/].*")) {
                Pattern pattern = Pattern.compile("[*/]");
                Matcher matcher = pattern.matcher(term);
                String[] splitTerm = term.split("[*/]");
                termTotal = Double.parseDouble(splitTerm[0]);
                int matchNumber = 0;
                while (matcher.find()) {
                    matchNumber++;
                    if (matcher.group().equals("*")) {
                        termTotal = termTotal
                                * Double.parseDouble(splitTerm[matchNumber]);
                    } else {
                        termTotal = termTotal
                                / Double.parseDouble(splitTerm[matchNumber]);
                    }
                }
            } else {
                termTotal = Double.parseDouble(term);
            }
            exprSolved = exprSolved + termTotal;
        }
        return exprSolved;
    }
    
}