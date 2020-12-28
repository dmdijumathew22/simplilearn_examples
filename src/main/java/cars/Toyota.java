package cars;

public class Toyota extends Car {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Toyota(String vin) {
        super(vin);
        electric = false;
    }

    String model = "toyota";

    public String getModel() {
        return model;
    }

}
