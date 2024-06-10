//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {

//        System.out.println(Thread.activeCount());
//        Thread.currentThread().setName("nainnnnnnnn");
//        System.out.println(Thread.currentThread().getName());

        Thread.currentThread().setPriority(9);
//
//        System.out.println(Thread.currentThread().getPriority());
//        System.out.println(Thread.currentThread().isAlive());
//
//        for(int i = 3; i >= 0;i--){
//            System.out.println(i);
//            Thread.sleep(2000);
//        }
//        System.out.println("You are done!");

        MyThread thread2 = new MyThread();
                thread2.setDaemon(true);

        thread2.start();
//        System.out.println(thread2.isAlive());
        thread2.setName("heyyyyyy");
        System.out.println(thread2.getName());
        thread2.setPriority(7);



        System.out.println(thread2.isDaemon());
        System.out.println(thread2.getPriority());

                System.out.println(Thread.activeCount());

    }
}