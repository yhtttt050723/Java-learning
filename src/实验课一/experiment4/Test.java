package 实验课一.experiment4;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class DataShare {
    private static final int BUFFER_SIZE = 10;
    private static Product[] buffer = new Product[BUFFER_SIZE];
    private static int count = 0; // 当前缓冲区中产品的数量
    private static int inIndex = 0; // 生产者的插入位置
    private static int outIndex = 0; // 消费者的取出位置
    private static final Lock myLock = new ReentrantLock();
    private static final Condition notFull = myLock.newCondition();
    private static final Condition notEmpty = myLock.newCondition();

    public static void produce(Product product) {
        myLock.lock();
        try {
            while (count == BUFFER_SIZE) {
                System.out.println("缓冲区已满, 生产者等待...");
                notFull.await();
            }
            buffer[inIndex] = product;
            inIndex = (inIndex + 1) % BUFFER_SIZE;
            ++count;
            System.out.println("生产者--生产了：" + product.name + " --剩余空间: " + (BUFFER_SIZE - count));
            notEmpty.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            myLock.unlock();
        }
    }

    public static Product consume() {
        Product product = null;
        myLock.lock();
        try {
            while (count == 0) {
                System.out.println("缓冲区为空, 消费者等待...");
                notEmpty.await();
            }
            product = buffer[outIndex];
            outIndex = (outIndex + 1) % BUFFER_SIZE;
            --count;
            System.out.println("消费者--消费了：" + product.name + " --剩余产品: " + count);
            notFull.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            myLock.unlock();
        }
        return product;
    }
}

class Product {
    String name;
    long num;

    public Product(String name, long num) {
        this.name = name;
        this.num = num;
    }
}

// 生产者线程类
class ProduceThread extends Thread {
    private int id;

    public ProduceThread(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        while (true) {
            Product product = new Product("Product-" + id, System.currentTimeMillis());
            实验课一.experiment4.DataShare.produce(product);
            try {
                Thread.sleep(500); // 模拟生产时间
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// 消费者线程类
class ConsumerThread extends Thread {
    @Override
    public void run() {
        while (true) {
            Product product = 实验课一.experiment4.DataShare.consume();
            try {
                Thread.sleep(500); // 模拟消费时间
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Test {
    public static void main(String[] args) {
        // 创建多个生产者和消费者线程
        for (int i = 0; i < 2; i++) {
            new ProduceThread(i).start();
        }
        for (int i = 0; i < 2; i++) {
            new ConsumerThread().start();
        }
    }
}