package personapersona;

class Persona {
	private String nombre;
	private int edad;
	private dni documento;

	public Persona(String nombre, int edad, int numero, char letra) {
		this.nombre = nombre;
		this.edad = edad;
		this.documento = new dni(numero, letra);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public dni getDocumento() {
		return documento;
	}

	public void setDocumento(dni documento) {
		this.documento = documento;
	}

}

//Definimos clase DNI
class dni {
	private int numero;
	private char letra;

	public dni(int numero, char letra) {
		this.numero = numero;
		this.letra = letra;

	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public char getLetra() {
		return letra;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}

	@Override
	public String toString() {
		return "" + numero+ letra ;
	}
	
}

interface Salario {
	double calcularSalario();
}

class Empleado extends Persona implements Salario {
    private double salarioBase;
    private double bono;

    public Empleado(String nombre, int edad, double salarioBase, double bono,int numero, char letra) {
        super(nombre, edad,numero,letra);
        this.salarioBase = salarioBase;
        this.bono = bono;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bono;
    }
}


	public class EjemploClases {

		public static void main(String[] args) {
			Empleado empleado1= new Empleado("Juan",30,50000,10000,12345678,'B');
			Empleado empleado2= new Empleado("Maria",28,45000,8000,87654321,'A');
			
			System.out.println("Empleado 1: "+empleado1.getNombre()+" - DNI: "+empleado1.getDocumento().toString()+" - Edad: "+empleado1.getEdad()+" - Salario: "
					+ empleado1.calcularSalario());
			System.out.println("---------------------------------------------------------------------------");
			System.out.println("Empleado 2: "+empleado2.getNombre()+" - DNI: "+empleado2.getDocumento().toString()+" - Edad: "+empleado2.getEdad()+" - Salario: "
					+ empleado2.calcularSalario());

	}

}
