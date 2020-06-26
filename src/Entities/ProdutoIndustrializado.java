package Entities;

import java.util.Date;

public class ProdutoIndustrializado extends Produto{
	private int fabricante;
    private int fornecedor;
    private int marca;

	public ProdutoIndustrializado() {
		super();
	}

	public ProdutoIndustrializado(int codigo, String descComp, String descRes, String modelo, double margem,
            double precoCusto, double peso, String cor, String obs, String utilidade, double ipi, 
            double icms, double frete, double precoVenda, Date dataCad, String status, Estoque estoque) {
    	
        super(codigo, descComp, descRes, modelo, margem, precoCusto, peso, cor, obs, utilidade, ipi, 
                icms, frete, precoVenda, dataCad, status, estoque);
    }
	
    public int getFabricante() {
		return fabricante;
	}

	public void setFabricante(int fabricante) {
		this.fabricante = fabricante;
	}

	public int getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(int fornecedor) {
		this.fornecedor = fornecedor;
	}

	public int getMarca() {
		return marca;
	}

	public void setMarca(int marca) {
		this.marca = marca;
	}

}
