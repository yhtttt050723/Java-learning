package Unit11;
/*
线程与线程类

 */
public class Unit11_1 {
    public static void main(String[] args) {
        CustomeThread myThread = new CustomeThread("线程A");
        myThread.start();
        for (int i = 0;i < 3;i++){
            System.out.println(i+"\t");
        }
    }

}
class CustomeThread extends Thread{
    CustomeThread(String s){
        super(s);
    }
    @Override
    public void run() {
        super.run();
        for (int i =0; i < 6; i++){
            System.out.println(this.getName()+i*3+"\t");
        }
    }
}