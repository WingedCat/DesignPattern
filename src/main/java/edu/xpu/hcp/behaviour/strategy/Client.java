package edu.xpu.hcp.behaviour.strategy;

public class Client {
    public static void main(String[] args) {
        Context context = new Context(new BubbleSortStrategy(),new int[]{7,2,3,4,9});
        context.sort();
        context.display();
        context.setStrategy(new QuickSortStrategy());
        context.sort();
        context.display();
    }
}
