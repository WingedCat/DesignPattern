package edu.xpu.hcp.behaviour.strategy;

public class Context {
    private SortStrategy strategy;
    private int[] array;

    public Context(SortStrategy strategy,int[] array){
        this.strategy = strategy;
        this.array = array;
    }

    public void setStrategy(SortStrategy strategy){
        this.strategy = strategy;
    }

    public void sort(){
        this.strategy.sort(array);
    }

    public void display(){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

}
