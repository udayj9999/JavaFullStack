package multithreading;

public class ProducerConsumer {

    int num;

    public void put(int num) {
        System.out.println("Put:" + num);
        this.num = num;
    }

    public void get() {

        System.out.println("Get:" + num);
    }
}


class Producer implements Runnable{

    ProducerConsumer producerConsumer;

    Producer(ProducerConsumer producerConsumer){
        this.producerConsumer = producerConsumer;
        Thread thread = new Thread(this,"Producer");
        thread.start();
    }

    @Override
    public void run() {
        int i=0;
        while (true) {
            producerConsumer.put(i++);
            try { Thread.sleep(500); } catch (InterruptedException e) { }
        }
    }
}
class Consumer implements Runnable{

    ProducerConsumer producerConsumer;

    Consumer(ProducerConsumer producerConsumer){
        this.producerConsumer = producerConsumer;
        Thread thread = new Thread(this,"Consumer");
        thread.start();
    }

    @Override
    public void run() {

        while (true) {
            producerConsumer.get();
            try { Thread.sleep(500); } catch (InterruptedException e) { }
        }
    }
}

class PCMain{

    public static void main(String[] args) {
        ProducerConsumer producerConsumer = new ProducerConsumer();
        Producer producer = new Producer(producerConsumer);
        Consumer consumer = new Consumer(producerConsumer);


    }
}