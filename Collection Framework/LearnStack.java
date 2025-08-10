//A Stack is a linear data structure that follows the LIFO principle:

//Last In, First Out → the last element added is the first one to be removed.

import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        Stack<String> list = new Stack<>();

        //Insert an element at the top
        list.push("Anu");
        list.push("Kar");
        list.push("elena");
        list.push("damon");

        //Remove the top element
        list.pop();

        //View the top element
        System.out.println(list.peek());

        //returns the size
        System.out.println(list.size());

        //checks if the list is empty
        System.out.println(list.isEmpty());

        System.out.println(list);
    }
}
