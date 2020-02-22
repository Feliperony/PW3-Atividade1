
public class CalculadoraConstrucao {

	public static void main(String[] args) {
		
		//Casa
		int area = area(20,20);
		System.out.println(area);
		
		double construcao = areaconstruida(area,50);
		System.out.println(construcao);
		
		
		//Piscina
		double raio = raio(6);
		System.out.println(raio);
		
		double pi = area(raio);
		System.out.println(pi);
		
		//Total
		double custocasa = custocasa(construcao);
		System.out.println("Custo casa: "  + String.format("R$%.2f", custocasa));
		
		double total = resutotal(6);
		System.out.println("Custo da piscina:" + String.format("R$%.2f", total));
		
		
		double custototal = custotoal(total,custocasa);
		System.out.println("Custo total da obra: " + String.format("R$%.2f",custototal));
	}
	//Casa
	public static int area(int larg, int compr) {
		return larg * compr;
	}
	public static double areaconstruida(int areatoatal,int percentual) {
		return (areatoatal * percentual)/100;
	}
	public static double custocasa(double construcao) {
		return construcao * 60;
	}
	//Piscina
	public static double raio(double diametro) {
		return diametro / 2;
		
	}
	public static double area(double raio) {
		return Math.PI * Math.pow(raio, 2);
	}
	public static double resutotal(int diametro) {
		double raio = raio(diametro);
		double area = area(raio);
		return area * 75;
	}
	//Total
	public static double custotoal(double total, double custocasa) {
		return total + custocasa;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
