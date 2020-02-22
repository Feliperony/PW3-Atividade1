
public class Casa {

	public static void main(String[] args) {
		
		int area = area(20,20);
		System.out.println(area);
		
		double construcao = areaconstruida(area,50);
		System.out.println(construcao);
		
		double custocasa = custocasa(construcao);
		System.out.println("Custo casa: " + custocasa);
	}
	public static int area(int larg, int compr) {
		return larg * compr;
	}
	public static double areaconstruida(int areatoatal,int percentual) {
		return (areatoatal * percentual)/100;
	}
	public static double custocasa(double construcao) {
		return construcao * 60;
	}										
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
