package concepts.threads;

public class RunnableClass implements Runnable {
    @Override
    public void run(){
        for (int i = 0; i < 3; i++) {
            try{
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(i+" from runnable");
        }
    }
}
