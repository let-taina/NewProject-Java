package produtos.model;

public class ProdutoBolsas extends produtos {
	
	private int estoqueParceiro;

	public ProdutoBolsas(int codProduto, int tipo, String nomeProduto, int saldoEstoque, float preco) {
		super(codProduto, tipo, nomeProduto, saldoEstoque, preco);
		this.estoqueParceiro = estoqueParceiro;
	
		
	}

	public int getEstoqueParceiro() {
		return estoqueParceiro;
	}

	public void setEstoqueParceiro(int estoqueParceiro) {
		this.estoqueParceiro = estoqueParceiro;
	}

	@Override
	public boolean saida (int quantidade) {
		
		if (this.getSaldoEstoque() + this.getEstoqueParceiro() < quantidade) {
			System.out.println("\\nNão há quantidade suficiente em estoque!");
			return false;
		}
		
		this.setSaldoEstoque(this.getSaldoEstoque() - quantidade);
		return true;
		}
	
	public void visualizar() {
		super.visualizar ();
		System.out.println("Quantidade em estoque parceiro: " + this.estoqueParceiro);
	}
	
}
