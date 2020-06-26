package Entities;

public class FabricaPropria {
	 private MateriaPrima materiaPrima;

	    public MateriaPrima getMateriaPrima() {
	        return materiaPrima;
	    }

	    public void setMateriaPrima(MateriaPrima materiaPrima) {
	        this.materiaPrima = materiaPrima;
	    }

	    public FabricaPropria(MateriaPrima materiaPrima) {
	        this.materiaPrima = materiaPrima;
	    }
}
