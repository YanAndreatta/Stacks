package main;

import dataStructure.Stack;

public class App 
{
    public static void main( String[] args )
    {   

        int [] numeros = {5,4,3,2,1};

        inverter(numeros);

        // Stack myStack = new Stack(2);
        // myStack.push(1);

        // System.out.println(myStack.pop().value);
        // System.out.println(myStack.pop().value);
        // System.out.println(myStack.pop());


        // myStack.getTop();
        // myStack.getHeight();

        // myStack.print();
        
        // myStack.push(1);

        // myStack.print();
        // myStack.getTop();
        // myStack.getHeight();
    }

    private static void inverter(int[] numeros) {
        Stack stack = new Stack(numeros[0]);

        for (int i = 1; i < numeros.length; i++) {
            stack.push(numeros[i]);;
        }

        var node = stack.pop();
        while (node != null) {
            System.out.println(node.getValue());
            node = stack.pop();
        }
    }
}
