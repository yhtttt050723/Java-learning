package Unit11;

public class Unit11_2 implements Runnable {
    String threadname;
    public Unit11_2(String threadname){
        this.threadname = threadname;
    }

    @Override
    public void run() {
        for (int i =0;i < 3;i++){
            System.out.println("正在运行的线程是"+i);
        }
        try{
            Thread.sleep((int)(Math.random()*1000));
        }catch(InterruptedException e){
            System.err.println(e.toString());
        }
    }

    public static void main(String[] args) {
        System.out.println("开始运行");
        Unit11_2 runable1 = new Unit11_2("线程A");
        Unit11_2 runable2 = new Unit11_2("线程B");
        Thread thread1 = new Thread(runable1);
        Thread thread2 = new Thread(runable2);
        thread1.start();
        thread2.start();
    }
}