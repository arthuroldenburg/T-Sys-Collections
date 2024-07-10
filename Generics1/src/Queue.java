import java.util.ArrayList;

public class Queue<T> {
    private ArrayList<T> fifoList;

    public Queue() {
        fifoList = new ArrayList<T>();
    }

    public void add(T e) {
        fifoList.add(e);
        System.out.println("Element " + e+ " added with success!");
    }

    public void remove() {
        T firstItem = fifoList.get(0);
        fifoList.removeFirst();
        System.out.println("Element " + firstItem+ " removed with success!");
    }

    public boolean isEmpty() {
        return fifoList.isEmpty();
    }

    public void showQueue() {
        for (int i = 0; i < fifoList.size(); i++) {
            System.out.println(fifoList.get(i));
        }
    }
}
