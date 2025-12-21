package trial1.questions.concepts.threads;

public class Main {
    public static void main(String[] args) {
        ExtendClass e = new ExtendClass();
        RunnableClass r = new RunnableClass();

        e.start();

        Thread rc = new Thread(r);
        rc.start();

        try{
            e.join();
            rc.join();
        } catch (Exception exp){
            System.out.println(exp);
        }

        System.out.println("The job is done here");
    }
}
