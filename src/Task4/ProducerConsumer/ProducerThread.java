package Task4.ProducerConsumer;

public class ProducerThread extends Thread{
    Market producer;
    public ProducerThread(Market producer) {
        this.producer=producer;
    }

    @Override
    public void run() {
        producer.produce();
    }

}
