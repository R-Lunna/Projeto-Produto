package Entities;

public class MateriaPrima {
	private int fabricante;
    private int fornecedor;
    private int marca;

    public MateriaPrima() {
        
    }
    
    public MateriaPrima(int fabricante, int fornecedor, int marca) {
        this.fabricante = fabricante;
        this.fornecedor = fornecedor;
        this.marca = marca;
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
