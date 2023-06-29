package Task4.ProducerConsumer;

import java.util.LinkedList;

public class Market {

    LinkedList<Integer> list = new LinkedList<>();
    int capacity = 5;

    public void produce()
    {
        int value = 0;
        while (true) {
            synchronized (this)
            {

                while (list.size() == capacity) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println("Producer produced, product no - "
                        + value);
                System.out.println("Capacity : " + (list.size()+1));
                list.add(value++);

                notifyAll();

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void consume()
    {
        while (true) {
            synchronized (this)
            {

                while (list.size() == 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                int val = list.removeFirst();

                System.out.println("Consumer consumed, product no - "
                        + val);
                System.out.println("Capacity : " + (list.size()));

                notifyAll();

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
