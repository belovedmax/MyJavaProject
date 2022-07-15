public abstract class EmployeeAbstractSuperclass {

        private final String firstName;
        private final String lastName;
        private final String socialSecurityNumber;

        public EmployeeAbstractSuperclass(String firstName, String lastName, String socialSecurityNumber) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.socialSecurityNumber = socialSecurityNumber;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getSocialSecurityNumber() {
            return socialSecurityNumber;
        }

        @Override

        public String toString() {
            return String.format("%s %s%n social security number: %s", getFirstName(), getLastName(), getSocialSecurityNumber());

        }
//earnings depends on the kind of employee
        public abstract double earnings();


    }

