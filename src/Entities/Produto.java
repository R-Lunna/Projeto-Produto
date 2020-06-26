package Entities;

import java.util.ArrayList;
import java.util.Date;

public class Produto {
   
    private int codigo;
    private String descComp;
    private String descRes;
    private String modelo;
    private double margem;
    private double precoCusto;
    private double peso;
    private String cor;
    private String obs;
    private String utilidade;
    private double ipi;
    private double icms;
    private double frete;
    private double precoVenda;
    private Date dataCad;
    private String status;
    private Estoque estoque;
    
    
    private ArrayList<Produto> produto;
    private Produto x;
    private int menosTrinta = 0;
    private int maisTrinta = 0;
    
    public Produto(int codigo, String descComp, String descRes, String modelo, double margem,
                    double precoCusto, double peso, String cor, String obs, String utilidade, double ipi, 
                    double icms, double frete, double precoVenda, Date dataCad, String status, Estoque estoque) {
        this.codigo = codigo;
        this.descComp = descComp;
        this.descRes = descRes;
        this.modelo = modelo;
        this.margem = margem;
        this.precoCusto = precoCusto;
        this.peso = peso;
        this.cor = cor;
        this.obs = obs;
        this.utilidade = utilidade;
        this.ipi = ipi;
        this.icms = icms;
        this.frete = frete;
        this.precoVenda = precoVenda;
        this.dataCad = dataCad;
        this.status = status;
        this.estoque = estoque;
    }
   
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescComp() {
        return descComp;
    }

    public void setDescComp(String descComp) {
        this.descComp = descComp;
    }

    public String getDescRes() {
        return descRes;
    }

    public void setDescRes(String descRes) {
        this.descRes = descRes;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getMargem() {
        return margem;
    }

    public void setMargem(double margem) {
        this.margem = margem;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getUtilidade() {
        return utilidade;
    }

    public void setUtilidade(String utilidade) {
        this.utilidade = utilidade;
    }

    public double getIpi() {
        return ipi;
    }

    public void setIpi(double ipi) {
        this.ipi = ipi;
    }

    public double getIcms() {
        return icms;
    }

    public void setIcms(double icms) {
        this.icms = icms;
    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public Date getDataCad() {
        return dataCad;
    }

    public void setDataCad(Date dataCad) {
        this.dataCad = dataCad;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Estoque getEstoque() {
        return estoque;
    }
    
    public int getMenosTrinta() {
		return menosTrinta;
	}

	public void setMenosTrinta(int menosTrinta) {
		this.menosTrinta = menosTrinta;
	}

	public int getMaisTrinta() {
		return maisTrinta;
	}

	public void setMaisTrinta(int maisTrinta) {
		this.maisTrinta = maisTrinta;
	}

	public Produto() {
    	produto = new ArrayList<Produto>();
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }
  
    public ArrayList<Produto> getProduto() {
    	return produto;
    }
    
    public void addProduct(Produto a, String modelo, int codigo, double precoCusto, double peso, String cor, String utilidade, double frete, double precoVenda, String desComp) {
    	this.x = a;
    	this.x = new Produto();
    	x.setModelo(modelo);
    	x.setCodigo(codigo);
    	x.setPrecoCusto(precoCusto);
    	x.setPeso(peso);
    	x.setCor(cor);
    	x.setUtilidade(utilidade);
    	x.setFrete(frete);
    	x.setPrecoVenda(precoVenda);
    	x.setDescComp(desComp);
    	produto.add(x);
    }
    
    public void remove(String desComp) {
    	int i = 0;
    	while (i < produto.size()) {
    		Produto produtos = this.produto.get(i);
    		if (produtos.getDescComp().equals(desComp)) {
    			produto.remove(i);
    		}
    		i++;
    	}
    }
    
    public int printProdutoPorDescricao(String desComp) {
    	int i = 0;
    	while (i < produto.size()) {
    		Produto produtos = this.produto.get(i);
    		if (produtos.getDescComp().equals(desComp)) {
    			System.out.println("código: " + produto.get(i).getCodigo());
        		System.out.println("Modelo: " + produto.get(i).getModelo());
        		System.out.println("Preço Custo: " + produto.get(i).getPrecoCusto());
        		System.out.println("Peso: " + produto.get(i).getPeso());
        		System.out.println("Cor: " + produto.get(i).getCor());
        		System.out.println("Utilidade: " + produto.get(i).getUtilidade());
        		System.out.println("Frete: " + produto.get(i).getFrete());
        		System.out.println("Preço venda: " + produto.get(i).getPrecoVenda());
        		System.out.println("DescComp: " + produto.get(i).getDescComp());
        		System.out.println();
        		return 1;
    		} 
    		i++;
    	}
    	return 0;
    }
    
    public void printProdutos() {
    	int i = 0;
    	while (i < produto.size()) {
    		System.out.println("código: " + produto.get(i).getCodigo());
    		System.out.println("Modelo: " + produto.get(i).getModelo());
    		System.out.println("Preço Custo: " + produto.get(i).getPrecoCusto());
    		System.out.println("Peso: " + produto.get(i).getPeso());
    		System.out.println("Cor: " + produto.get(i).getCor());
    		System.out.println("Utilidade: " + produto.get(i).getUtilidade());
    		System.out.println("Frete: " + produto.get(i).getFrete());
    		System.out.println("Preço venda: " + produto.get(i).getPrecoVenda());
    		System.out.println("DescComp: " + produto.get(i).getDescComp());
    		System.out.println();
    		i++;
    	}
    }
    
    public int numeroEstoque() {
    	return produto.size();
    }
    
    public int printProdutoPorCodigo(int codigo) {
    	int i = 0;
    	while (i < produto.size()) {
    		Produto produtos = this.produto.get(i);
    		if(produtos.getCodigo() == codigo) {
    			System.out.println("código: " + produto.get(i).getCodigo());
        		System.out.println("Modelo: " + produto.get(i).getModelo());
        		System.out.println("Preço Custo: " + produto.get(i).getPrecoCusto());
        		System.out.println("Peso: " + produto.get(i).getPeso());
        		System.out.println("Cor: " + produto.get(i).getCor());
        		System.out.println("Utilidade: " + produto.get(i).getUtilidade());
        		System.out.println("Frete: " + produto.get(i).getFrete());
        		System.out.println("Preço venda: " + produto.get(i).getPrecoVenda());
        		System.out.println("DescComp: " + produto.get(i).getDescComp());
        		System.out.println();
    			return 1;
    		}
    		i++;
    	}
    	System.out.println("Erro, produto não encontrado"); 
    	return 0;
    }
    
    public int percorreMaisTrinta() {
    	int i = 0;
    	while (i < produto.size()) {
    		Produto produtos = this.produto.get(i);
    		if (produtos.getPeso() > 30.0) {
    			maisTrinta++;
    			setMaisTrinta(maisTrinta);
    		}
    		i++;
    	}
    	return getMaisTrinta();
    }
    
    public int percorreMenosTrinta() {
    	int i = 0;
    	while (i < produto.size()) {
    		Produto produtos = this.produto.get(i);
    		if (produtos.getPeso() < 30) {
    			menosTrinta++;
    			setMenosTrinta(menosTrinta);
    		}
    		i++;
    	}
    	return getMenosTrinta();
    }
    
    public double Depreciacao(int codigo) {
    	int i = 0;
    	double valor;
    	while (i < produto.size()) {
    		Produto produtos = new Produto();
    		
    		if (produto.get(i).codigo == codigo) {
    			produtos = produto.get(i);
    			
    			valor = produtos.getPrecoVenda() * 0.02;
    			return valor;
    		}
    		i ++;
    	}
    	
    	System.out.println("Erro, produto não encontrado");
    	return 0;
    }
    
    public double Lucro(int codigo) {
    	int i = 0;
    	while (i < produto.size()) {
    		Produto produtos = this.produto.get(i);
    		if ((produtos.getCodigo() == codigo)) {
    			return produto.get(i).getPrecoVenda() - (produto.get(i).getPrecoVenda() * 0.18);
    		}
    		i++;
    	}
    	
    	System.out.println("Erro, produto não encontrado");
    	return 0;
    }
}
