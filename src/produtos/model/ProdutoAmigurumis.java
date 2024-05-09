package produtos.model;

public class ProdutoAmigurumis extends produtos {
	
	private float tamanho;

	public ProdutoAmigurumis(int codProduto, int tipo, String nomeProduto, int saldoEstoque, float preco) {
		super(codProduto, tipo, nomeProduto, saldoEstoque, preco);
		
		
	}
	
	public float getTamanho () {
		return tamanho;
	}
	
	public void setTamanho() {
		this.tamanho = tamanho;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Tamanho do amigurumi (cm): " +this.tamanho);
	}
}
