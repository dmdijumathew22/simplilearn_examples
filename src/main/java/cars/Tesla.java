package cars;

public class Tesla extends Car {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Tesla(String vin) {
        super(vin);
        electric = true;
    }

    String model = "tesla";

    public String getModel() {
        return model;
    }
}
