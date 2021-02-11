
public class Caminhao extends Transporte {
	
	public Caminhao(double peso, double valor) {
		super(peso, valor);
		
	}

	public double calculaFrete() {
		if (peso < 15.000) {
			valor += 5.000;
			
			return this.getValor() * ((valor*30) / valor ) + this.getPeso() * ((peso*12) / peso );
		}
		
		if (valor < 40.000) {
			valor = valor * 0.25;
			
			return this.getValor() * ((valor*30) / valor ) + this.getPeso() * ((peso*12) / peso );
		}
		
		return this.getValor() * ((valor*30) / valor ) + this.getPeso() * ((peso*12) / peso );
    }
	
}
