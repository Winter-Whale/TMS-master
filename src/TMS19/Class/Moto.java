package TMS19.Class;

public final class Moto extends Vehicle {
    private String CountryOfOrigin;

    public Moto(String model, String CountryOfOrigin) {
        super("Toyota", 120, 2);
        this.CountryOfOrigin = CountryOfOrigin;
    }

    public String getCountryOfOrigin() {
        return CountryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        CountryOfOrigin = countryOfOrigin;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "CountryOfOrigin='" + CountryOfOrigin + '\'' +
                '}';
    }
}
