
public class Vagao extends Transporte {
	
	public Vagao(double peso, double valor) {
		super(peso, valor);
		
	}

	public double calculaFrete() {
		if (peso < 15.000) {
			valor += 5.000;
			
			return this.getValor() * 0.20 + this.getPeso() * 0.10;
		}
		
		if (valor < 40.000) {
			valor = valor * 0.25;
			
			   return this.getValor() * 0.20 + this.getPeso() * 0.;
		}
		
		return this.getValor() * 0.20 + this.getPeso() * 0.10;
     }
	
}
