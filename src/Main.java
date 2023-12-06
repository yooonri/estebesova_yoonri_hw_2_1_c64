public class Main {
    public static void main(String[] args) {
            Address object1 = new Address("Habarashiki st. 65A", "Tokyo");
            Businesses businesses = new Businesses("Avangard", object1, BusinessTypes.MAIN, 20);

            Address object2 = new Address("Main St. 34", "Townsville");
            Offices sector1 = new Offices("Tech Hub", object2, BusinessTypes.GENERAL, 78, 3);

            Address object3 = new Address("Shonjin st. 12", "Kyoto");
            Offices sector2 = new Offices("Sakura", object3, BusinessTypes.MARKETING, 32, 3);

            businesses.printInfo();
            businesses.printInfo(140);
            System.out.println("~~~~~~~~~~~~~");

            sector1.printInfo();
            System.out.println("~~~~~~~~~~~~~");
            sector2.printInfo();
        }
    }