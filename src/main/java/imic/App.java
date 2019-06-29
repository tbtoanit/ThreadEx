package imic;

/**
 * Hello world!
 *
 */
public class App 
{
    int bal = 10;

    public synchronized void checkBalance(){
        for(int i = 0; i<10; i++){
            if(bal<=0){
                System.out.println("Het tien roi!!!");
                break;
            }else {
                bal = bal-1;
                System.out.println("Rut tien lan: "+i);
            }
        }
    }

    public static void main( String[] args )
    {
        final App a=new App();
        System.out.println( "Giao Dich Dang xu ly ..." );
        // Tao Tien trinh 1
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                a.checkBalance();
            }
        });

        //Tao Tien trinh 2
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                a.checkBalance();
            }
        });

        t1.start();
        t2.start();

    }



}
