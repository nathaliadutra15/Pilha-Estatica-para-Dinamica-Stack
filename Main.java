public class Main {
    public static void main(String[] args) {
        Stack s = new Stack(10);
        DynamicStack ds = new DynamicStack();

        //Inserting the values in the static stack
        for (int i = 0; i < 10; i++) {
            s.push(i);
        }

        //Transferring the values from the static stack to the dynamic stack
        for (int i = 0; i < 10; i++) {
            ds.push(s.pop());
        }

        //Repeat loop to print the values from the dynamic stack
        while (!ds.isEmpty()) {
            System.out.println(ds.pop());
        }

        


    }

    
}
