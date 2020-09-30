public class TransportIns extends Insurance {

    private String type;
    private String fuel;
    private double engcap;
    private String brand;
    private String model;
    private String vin;


    public static class Builder extends Insurance.Builder<Builder> {

        private String type;
        private String fuel;
        private double engcap;
        private String brand;
        private String model;
        private String vin;

        public Builder() {}

        public Builder Type(String val) {
            type = val;
            return this;
        }

        public Builder Fuel(String val) {
            fuel = val;
            return this;
        }

        public Builder Engcap(double val) {
            engcap = val;
            return this;
        }

        public Builder Brand(String val) {
            brand = val;
            return this;
        }

        public Builder Model(String val) {
            model = val;
            return this;
        }

        public Builder VIN(String val) {
            vin = val;
            return this;
        }

        public TransportIns build() { return new TransportIns(this);

        }
    }

    protected TransportIns(Builder builder) {
        super(builder);
        type = builder.type;
        fuel = builder.fuel;
        engcap = builder.engcap;
        brand = builder.brand;
        model = builder.model;
        vin = builder.vin;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        if (getClass() != o.getClass()) {
            return false;
        }
        TransportIns e = (TransportIns) o;
        return (this == e);
    }

    @Override
    public String toString() {
        return "Type= " + this.type + "\n"
                + "Fuel= " + this.fuel + "\n"
                + "Engcap= " + this.engcap + "\n"
                + "Brand= " + this.brand + "\n"
                + "Model= " + this.model + "\n"
                + "VIN= " + this.vin + "\n";

    }

    @Override
    public int hashCode() {
        int result = type.hashCode();
        result = 31 * result + fuel.hashCode();
        result = (int)(31 * result + engcap);
        result = 31 * result + brand.hashCode();
        result = 31 * result + model.hashCode();
        result = 31 * result + vin.hashCode();
        return result;

    }


    public static void main(String[] args) {
        Customers cus = new Customers(1, "Peter", "Steven", "21-04-2001", 56464,"+38054123678",656454);
        Employees emp = new Employees(1, "John", "Inc", "2017-1-25", 55448749,"+38054123678");
    //Insurance ins = new Insurance(1, 23423, cus, emp, "FULL", "21-09-2020", 1, 15600);
        TransportIns ins = new TransportIns.Builder()
                .idi(1)
                .sn(156024)
                .cust(cus)
                .emp(emp)
                .instype("Full")
                .crd("20-03-2013")
                .term(1.5)
                .amount(2300)
                .Type("Truck")
                .Fuel("Diesel")
                .Engcap(3.5)
                .Brand("KAMAZ")
                .Model("125")
                .VIN("WWAUZ354VAND")
                .build();

        System.out.println(ins);

    }

}

