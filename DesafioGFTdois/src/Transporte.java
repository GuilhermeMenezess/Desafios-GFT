
public abstract class Transporte extends Carga {
	
		public Transporte(double peso, double valor) {
			super(peso, valor);
		}
		
		public double calculaFrete() {
			
			 return this.getValor() * 0.01 + this.getPeso() * 0.01;
		}
		
		
	
}
	
