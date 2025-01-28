public class ITDepartment extends Department {

    public ITDepartment(int id) {
      super(id);
    }

     @Override
     public String getDepartmentName() {
        return "IT Department";
   }
   @Override
    public void print() {
         System.out.println("Department: id=" + getId() + ", name=" + getDepartmentName());
     }
}