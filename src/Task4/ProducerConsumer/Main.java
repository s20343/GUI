package Task4.ProducerConsumer;

public class Main {
    public static void main(String[] args) {

        final Market market = new Market();

        ProducerThread p1=new ProducerThread(market);
        ProducerThread p2=new ProducerThread(market);
        ProducerThread p3=new ProducerThread(market);
        ProducerThread p4=new ProducerThread(market);
        ProducerThread p5=new ProducerThread(market);

        ConsumerThread c1=new ConsumerThread(market);
        ConsumerThread c2=new ConsumerThread(market);
        ConsumerThread c3=new ConsumerThread(market);
        ConsumerThread c4=new ConsumerThread(market);
        ConsumerThread c5=new ConsumerThread(market);
        ConsumerThread c6=new ConsumerThread(market);
        ConsumerThread c7=new ConsumerThread(market);
        ConsumerThread c8=new ConsumerThread(market);
        ConsumerThread c9=new ConsumerThread(market);
        ConsumerThread c10=new ConsumerThread(market);

        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();

        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();
        c6.start();
        c7.start();
        c8.start();
        c9.start();
        c10.start();

        }
}
