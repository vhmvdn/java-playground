package arrays;

public class TestArrayBag {
    public static void main(String[] args) {
        ArrayBag bag = new ArrayBag(10);
        System.out.println("Is Bag empty? " + bag.isEmpty());

        bag.add(1);
        bag.add(2);
        bag.add(3);

        System.out.println("How many items in the bag? " + bag.size());

        bag.add(4);
        bag.add(5);
        bag.add(6);
        bag.add(7);

        System.out.println("Is the bag full? " + bag.isFull());

        bag.add(8);
        bag.add(9);
        bag.add(10);

        System.out.println(bag);

        System.out.println("Is the bag contains " + " 4? " + bag.contains(4));

        System.out.println("How many elements in the bag? " + bag.size());

        System.out.println("Is the bag contains " + " 11? " + bag.contains(11));

        bag.add(3);

        bag.remove(1);
//        bag.remove(8);
//
//        System.out.println("Does the bag contains " + " 10? " + bag.contains(10));
//
//        System.out.println("How many elements in the bag? " + bag.size());
//
//        System.out.println(bag);
    }
}
