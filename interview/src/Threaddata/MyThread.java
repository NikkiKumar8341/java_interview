package Threaddata;

public class MyThread implements Runnable{

    public void run(){
        for (int i=1;i<=10;i++){
            System.out.println("values of i is "+i);

            try {
               Thread.sleep(1000);
            }catch (Exception e){

            }
        }
    }

    public static void main(String[] args) {
        MyThread t1=new MyThread();

        Thread thr=new Thread(t1);


        //another thread
        MyAnotherThread t2=new MyAnotherThread();
        thr.start();
        t2.start();
    }
}
