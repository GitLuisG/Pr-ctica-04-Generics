package edu.upv.poo;

public class Practica04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Practica04().run();
    }
    
    public void run() {
        
        System.out.println("Práctica 04");
        
        Integer[] intArr = {1, 2, 3, 4, 5, 6};
        Double[] doubleArr = {1.1, 1.2, 2.2, 3.1};
        Character[] charArr = {'H', 'O', 'L', 'A'};
        
        printArr(intArr);
        printArr(doubleArr);
        printArr(charArr);
        
        Integer last = printArrReturnLast(intArr);
        System.out.println("Last element: " + last);
        
        Integer maxInt = maximum(3, 9, 1);
        System.out.printf("Max of %d, %d, %d is %d\n",
                3, 9, 1, maxInt);
        
        String maxStr = maximum("apple", "pear", "orange");
        System.out.printf(
                "Max of apple, pear and orange is %s\n",
                maxStr);
        
        Integer maxInt2 = (Integer)maximumX(9, 10, 1);
        
        Stack<Integer> intStack = new Stack<>();
        testPushIntStack(intStack, intArr);
        testPopIntStack(intStack);
        
        Stack<Double> doubleStack = new Stack<>();
        testPushStack(doubleStack, doubleArr);
        testPopStack(doubleStack);
        
    }
    
    public void testPushIntStack(
            Stack<Integer> stack, Integer[] vals) {
        System.out.println("Testing push in stack of integers.");
        for (Integer i : vals) {
            System.out.println(i);
            stack.push(i);
        }
    }
    
    public <T> void testPushStack(Stack<T> stack, T[] vals) {
        System.out.println("Testing push the generic way!");
        for (T i : vals) {
            System.out.println(i);
            stack.push(i);
        }
    }
    
    public void testPopIntStack(Stack<Integer> stack) {
        System.out.println("Testing pop in stack of integers");
        while (!stack.isEmpty()) {
            Integer i = stack.pop();
            System.out.println(i);
        }
    }
    
    public <T> void testPopStack(Stack<T> stack) {
        System.out.println("Testing pop the generic way!");
        while (!stack.isEmpty()) {
            T i = stack.pop();
            System.out.println(i);
        }
    }
    
    public <T> void printArr(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            T e = arr[i];
            System.out.printf("[%d] = %s\n", i , e);
        }
    }
    
    public <T> T printArrReturnLast(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            T e = arr[i];
            System.out.printf("[%d] = %s\n", i , e);
            if (i == arr.length - 1) 
                return e;
        }
        return null;
    }
    
    public <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) max = y;
        if (z.compareTo(max) > 0) max = z;
        return max;
    }
    
    public Comparable maximumX(Comparable x, Comparable y, Comparable z) {
        Comparable max = x;
        if (y.compareTo(max) > 0) max = y;
        if (z.compareTo(max) > 0) max = z;
        return max;
    }
    
}
