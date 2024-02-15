package lanzarProcesos;

public class LanzarProcesos {

	
	
	public void ejecutar(String ruta) {
		ProcessBuilder pb;
		try {
			pb = new ProcessBuilder(ruta);
			pb.start();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		String ruta= "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
		LanzarProcesos lp= new LanzarProcesos();
				lp.ejecutar(ruta);
		System.out.println("Finalizado");
		
	}
	
}
