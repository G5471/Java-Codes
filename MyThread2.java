public class MyThread2 extends Thread {
    public void run(){
        for(int i=10;i>=1;i--){
            System.out.println(i);
            try{
                Thread.sleep(2000);
            }catch(Exception e){

            };
        }
    }
}
