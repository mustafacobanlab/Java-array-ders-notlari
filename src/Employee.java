public class Employee {
    private String name;
    public double salary;
    private int workHours,hireYears;



    Employee(int hireYears,int workHours,double salary,String name){
            this.name = name;
            this.salary = salary;
            this.workHours = workHours;
            this.hireYears = hireYears;
    }
    public double tax(){
        if(this.salary >= 1000) {
            return salary * 0.03;
        }
        return 0.0;
    }

    public double bonus(){
         int extraHours = this.workHours - 40;
         if(extraHours > 0){
             return 30 * extraHours;
         }
        return 0.0;
    }
    public double incrase(){
        int year = 2020-this.hireYears;
        if (year< 10) {
            return salary * 0.5;
        }else if(year >= 10 && year <20){
            return salary * 0.10;
        }else {
            return salary * 0.15;
        }
    }
        public void toString(Employee employee){
            System.out.println("Tax: " + employee.tax() );
            System.out.println("Bonus: " + employee.bonus());
            System.out.println("Incrase salary: " + employee.incrase());
            double totalSalary = employee.salary - employee.tax() + employee.bonus();
            System.out.println("Total Salary with tax and bonus: " + totalSalary);
            System.out.println("Total Salary with the raise of salary: " + (employee.incrase() + totalSalary));
    }
}
