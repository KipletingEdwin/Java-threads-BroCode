//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {

//        System.out.println(Thread.activeCount());
//        Thread.currentThread().setName("nainnnnnnnn");
//        System.out.println(Thread.currentThread().getName());

        Thread.currentThread().setPriority(9);

        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().isAlive());

        for(int i = 3; i >= 0;i--){
            System.out.println(i);
            Thread.sleep(2000);
        }

    }
}