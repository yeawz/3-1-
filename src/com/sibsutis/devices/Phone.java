import java.util.Objects;

    public class Phone extends Device {
        private String phoneNumber;

       public Phone(int id, String name, String phoneNumber) {
            super(id, name);
            this.phoneNumber = phoneNumber;
        }

         public String getPhoneNumber() {
            return phoneNumber;
       }

         @Override
        public void print() {
             System.out.println("Phone: id=" + getId() + ", name=" + getName() + ", phone=" + phoneNumber);
       }
         @Override
       public String toString() {
             return "Phone{" +
                    "id=" + getId() +
                    ", name='" + getName() + '\'' +
                     ", phoneNumber='" + phoneNumber + '\'' +
                    '}';
        }
         @Override
       public boolean equals(Object o) {
             if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
             Phone phone = (Phone) o;
            return getId() == phone.getId() && Objects.equals(getName(), phone.getName()) && Objects.equals(phoneNumber, phone.phoneNumber);
       }

       @Override
       public int hashCode() {
            return Objects.hash(getId(), getName(), phoneNumber);
        }
    }