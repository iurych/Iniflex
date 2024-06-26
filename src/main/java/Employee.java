import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee extends Person {
    private BigDecimal salary;
    private String role;

    public Employee(String name, LocalDate birthDate, BigDecimal salary, String role) {
        super(name, birthDate);
        this.salary = salary;
        this.role = role;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("d/M/y");
        DecimalFormat decimalFormatter = new DecimalFormat("#,##0.00");

        return "Employee nome: " + getName() + ", data de Nascimento: " + getBirthDate().format(dateFormatter) + ", salary " + decimalFormatter.format(salary) + ", role: " + role;
    }

}
