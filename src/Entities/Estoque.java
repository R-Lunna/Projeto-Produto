package Entities;

public class Estoque {
	  	private int codProd;
	    private int codLoja;
	    private double saldo;
	    private double qtdeMin;
	    

	    public Estoque() {
	    }
	    
	    public Estoque(int codProd, int codLoja, double saldo, double qtdeMin) {
	        this.codProd = codProd;
	        this.codLoja = codLoja;
	        this.saldo = saldo;
	        this.qtdeMin = qtdeMin;
	    }

	    public int getCodProd() {
	        return codProd;
	    }

	    public void setCodProd(int codProd) {
	        this.codProd = codProd;
	    }

	    public int getCodLoja() {
	        return codLoja;
	    }

	    public void setCodLoja(int codLoja) {
	        this.codLoja = codLoja;
	    }

	    public double getSaldo() {
	        return saldo;
	    }

	    public void setSaldo(double saldo) {
	        this.saldo = saldo;
	    }

	    public double getQtdeMin() {
	        return qtdeMin;
	    }

	    public void setQtdeMin(double qtdeMin) {
	        this.qtdeMin = qtdeMin;
	    }
	    
}
