
class TeamMember {
    protected String name;

    public TeamMember(String name) {
        this.name = name;
    }
}

interface BounsEligible {
    void calculateBouns();
}

class Employee extends TeamMember implements BounsEligible {
    public Employee(String name) {
        super(name);
    }

    public void calculateBouns() {
        System.out.println("Calculating standard employee bouns...");
    }
}

class Contractor extends TeamMember {
    public Contractor(String name) {
        super(name);
    }

    public void submitInvoice() {
        System.out.println("Submitting contractor invoice..");
    }
}


public class Main2 {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice");
        emp.calculateBouns();

        Contractor con = new Contractor("Bob");
        con.submitInvoice();
    }
}

