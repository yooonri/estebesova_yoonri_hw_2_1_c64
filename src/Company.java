public class Company {
        private String name;
        private Address address;
        private BusinessTypes businessTypes;

        public Company(String name, Address address,BusinessTypes businessTypes ) {
            this.name = name;
            this.address = address;
            this.businessTypes = businessTypes;
        }

        public String getName() {
            return name;
        }

        public Address getAddress() {
            return address;
        }

        public BusinessTypes getBusinessTypes() {
            return businessTypes;
        }
    }
