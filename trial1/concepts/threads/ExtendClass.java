package trial1.questions.concepts.threads;

public class ExtendClass extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 4; i++) {
            try{
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(i + " from extends");
        }
    }
}
