package homework3;

import java.util.*;

public abstract class Transport {

    private final String brand;
    private final String model;
    private  int productionYear;
    private  String productionCountry;
    private String color;
    private int maxSpeed;

    private final Set<Driver<?>> drivers = new HashSet<>();

    private final Set<Michanic<?>> mechanics = new HashSet<>();

    private final Set<Sponsor> sponsors = new HashSet<>();

    public Transport(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Transport(String brand, String model, int productionYear, String productionCountry, int maxSpeed) {
        this(brand,
                model,
                productionYear,
                productionCountry,
                "белый",
                maxSpeed
        );
    }

    public Transport(String brand, String model, int productionYear, String productionCountry, String color) {
        this(brand,
                model,
                productionYear,
                productionCountry,
                color,
                100
        );
    }

    public Transport(String brand,
                     String model,
                     int productionYear,
                     String productionCountry,
                     String color,
                     int maxSpeed) {
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
        this.productionYear = productionYear;
        if (productionCountry == null) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }
        setColor(color);
        setMaxSpeed(maxSpeed);
    }

    public Set<Driver<?>> getDrivers() {
        return drivers;
    }

    public Set<Michanic<?>> getMechanics() {
        return mechanics;
    }

    public Set<Sponsor> getSponsors() {
        return sponsors;
    }

    public void addDriver(Driver<?>... drivers) {
        this.drivers.addAll(Arrays.asList(drivers));
    }

    public void addMichanic(Michanic<?>... michanics) {
        this.mechanics.addAll(Arrays.asList(michanics));
    }

    public void addSponsor(Sponsor... sponsor) {
        this.sponsors.addAll(Arrays.asList(sponsor));
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setColor(String color) {
        if (color != null && !color.isEmpty() && !color.isBlank()) {
            this.color = color;
        }
        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed < 0) {
            this.maxSpeed = 100;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }
    public abstract String refill();

    public abstract String starMoving();

    public abstract String stopMoving();

    public abstract void printType();

    public abstract boolean service();

    public abstract void repair();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return productionYear == transport.productionYear && maxSpeed == transport.maxSpeed && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model) && Objects.equals(productionCountry, transport.productionCountry) && Objects.equals(color, transport.color) && Objects.equals(drivers, transport.drivers) && Objects.equals(mechanics, transport.mechanics) && Objects.equals(sponsors, transport.sponsors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, productionYear, productionCountry, color, maxSpeed, drivers, mechanics, sponsors);
    }
}
