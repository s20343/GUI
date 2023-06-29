package Task4.ProducerConsumer;

public class ConsumerThread extends Thread{
    Market consumer;
    public ConsumerThread(Market consumer) {
        this.consumer=consumer;
    }

    @Override
    public void run() {
        consumer.consume();
    }
}
