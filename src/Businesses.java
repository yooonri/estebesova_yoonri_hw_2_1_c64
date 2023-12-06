public class Businesses extends Company{
    private int numBusinesses;

    public Businesses(String name, Address address, BusinessTypes businessTypes, int numBusinesses) {
        super(name, address, businessTypes);
        this.numBusinesses = numBusinesses;
    }

    public int getNumBusinesses() {
        return numBusinesses;
    }
    public void printInfo() {
        System.out.println("Bussnes Name: " + getName());
        System.out.println("Bussnes Type: " + getBusinessTypes());
        System.out.println("Address: " + getAddress().getStreet() + ", " + getAddress().getCity());
        System.out.println("Number of Bussneses: " + getNumBusinesses());
    }

    public final void printInfo(int square){
        System.out.println("Office rooms: " + square);
    }
}

