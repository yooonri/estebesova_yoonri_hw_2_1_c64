public final class  Offices extends Businesses{
    private int numberOfOffice;

    public Offices (String name, Address address, BusinessTypes businessesTypes, int numBusinesses, int numberOfOffice) {
        super(name, address, businessesTypes, numBusinesses);
        this.numberOfOffice = numberOfOffice;
    }

   public void printInfo(){
        super.printInfo();
       System.out.println("Office rooms: " + getNumberOfOffice());
   }

    public int getNumberOfOffice() {
        return numberOfOffice;
    }
}
