package Multihilo;

class Calculador implements Runnable{
    @Override
    public void run() {
            int num=0;
            while(num<5){
                    try {
                            long tiempo=(long) (1000*Math.random()*10);
                            Thread hilo=Thread.currentThread();
                            System.out.println(hilo.getName() + ": Calculando...");
                            if (tiempo>8000){
                                    System.out.println(hilo.getName() + ": Terminando hilo.");
                                    hilo.join();
                            }
                            Thread.sleep(tiempo);
                            System.out.println(hilo.getName() + ": Calculado y reiniciando por " + tiempo + " milisegundos.");
                         } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                    }
                    num++;
            }
            Thread hilo=Thread.currentThread();
            System.out.println(hilo.getName() + ": Hilo terminado.");
    }
}
    
public class CalcularHilos {
    public static void main(String[] args) {
            Calculador vHilos[]=new Calculador[10];
            for (int i=0; i<10;i++){
                    vHilos[i]=new Calculador();
                    Thread hilo=new Thread(vHilos[i]);
                    hilo.setName("Hilo "+i);
                    if (i==0){
                            hilo.setPriority(Thread.MAX_PRIORITY);
                    }
                    hilo.start();
            }
    }
}