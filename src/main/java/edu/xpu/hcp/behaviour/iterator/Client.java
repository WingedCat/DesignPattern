package edu.xpu.hcp.behaviour.iterator;

public class Client {
    public static void main(String[] args) {
        Aggregate<Integer> integerAggregate = new ConcreteAggregate();
        integerAggregate.add(1);
        integerAggregate.add(2);
        integerAggregate.add(4);
        integerAggregate.add(5);
        integerAggregate.add(6);
        integerAggregate.add(3);

        Iterator<Integer> iterator = integerAggregate.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
