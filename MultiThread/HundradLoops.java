class HundradLoops extends Thread{
    @Override
    public void run(){
        for(int i=0;i<100;i++){
        System.out.println("This is 100 loops");
        }
    }
}