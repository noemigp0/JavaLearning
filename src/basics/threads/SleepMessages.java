package basics.threads;

public class SleepMessages implements Runnable{
    public static void main(String args[]) throws InterruptedException{

        (new Thread(new SleepMessages())).start();

        }

    @Override
    public void run() {

        String importantInfo [] = {
                "Mares eat oats",
                "Does eat oats",
                "Little lambs eat ivy",
                "A kid eat ivy too"
        };

        for(int i = 0; i < importantInfo.length; i++ ) {
            //pause for 4 seconds
            try {
                Thread.sleep(4000);

              
            } catch(InterruptedException ie){
                return;

            }
            //Print message
            System.out.println(importantInfo[i]);
        }
    }
}

