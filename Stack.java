public class Stack{
    private int dados[];
    private int topo; // Quantity of elements

    //Constructor
    public Stack(int tamanho){
        this.dados = new int[tamanho];
        this.topo = 0; 
    }

    //push elements
    public void push(int elemento){
        if(this.dados.length > this.topo){ // or (!this.isFull)
            this.dados[this.topo] = elemento;
            this.topo++;
        }
    }

    //size
    public int size(){
        return this.topo;
    }

    //remove element
    public int pop(){
        if (this.topo > 0){ // or (!this.isEmpty)
            this.topo--;
            return this.dados[this.topo];
        } else{
            System.out.println("Pilha vazia!");
            return -1;
        }
    }

    //Is it full?
    public boolean isFull(){
        if (this.topo == this.dados.length) {
            return true;
        } else{
            return false;
        }
    }

    // Is it empty?
    public boolean isEmpty(){
        if (this.topo == 0) {
            return true;
        } else{
            return false;
        }
    }

    //Reset
    public void reset(){
        this.topo = 0;
    }
}