package directorio;

public class lanzador {
	  public void lanzarSumador(Integer n1, Integer n2){
          String clase= System.getProperty("user.dir") + "\\Sumador.java";
          ProcessBuilder pb;
          try {
                  pb = new ProcessBuilder(
                                  "java",clase,
                                  n1.toString(),
                                  n2.toString());
                  pb.start();
          } catch (Exception e) {
                  e.printStackTrace();
          }
  }
  public static void main(String[] args){
	  lanzador l=new lanzador();
          l.lanzarSumador(1, 5);
          l.lanzarSumador(6, 10);
          System.out.println("Ok");
  }
}
