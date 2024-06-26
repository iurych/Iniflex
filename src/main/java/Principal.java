import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Principal {
    public static void main(String[] args) {
        // 3.1 Inserir todos os funcionários
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Maria", LocalDate.of(1990, 11, 10), new BigDecimal("2009.44"), "Operador"));
        employeeList.add(new Employee("João", LocalDate.of(1991, 5, 12), new BigDecimal("2284.38"), "Operador"));
        employeeList.add(new Employee("Caio", LocalDate.of(1961, 5, 2), new BigDecimal("9836.14"), "Coordenador"));
        employeeList.add(new Employee("Miguel", LocalDate.of(1988, 10, 14), new BigDecimal("19119.88"), "Diretor"));
        employeeList.add(new Employee("Alice", LocalDate.of(1995, 1, 5), new BigDecimal("2234.68"), "Recepcionista"));
        employeeList.add(new Employee("Heitor", LocalDate.of(1999, 11, 19), new BigDecimal("1582.72"), "Operador"));
        employeeList.add(new Employee("Arthur", LocalDate.of(1993, 3, 31), new BigDecimal("4071.84"), "Contador"));
        employeeList.add(new Employee("Laura", LocalDate.of(1994, 7, 8), new BigDecimal("3017.45"), "Gerente"));
        employeeList.add(new Employee("Heloísa", LocalDate.of(2003, 5, 24), new BigDecimal("1606.85"), "Eletricista"));
        employeeList.add(new Employee("Helena", LocalDate.of(1996, 9, 2), new BigDecimal("2799.93"), "Gerente"));

        // 3.2 Remover Funcionário "João"
//        employeeList.removeIf(employee -> employee.getName().equals("João"));

        // 3.3 Imprimir todos os Funcionários
       /*
        System.out.println("Lista de funcionários");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
        */

        // 3.4 Aumentar Salário em 10%
        /*
        double additionFactor = 1.1;
        BigDecimal additionFactorAsBigDecimal = BigDecimal.valueOf(additionFactor);

        for (Employee employee : employeeList) {
            BigDecimal employeeSalary = employee.getSalary();
            BigDecimal raisedSalary = employeeSalary.multiply(additionFactorAsBigDecimal);
            employee.setSalary(raisedSalary);
        }
        */

        /*
        // 3.5 Agrupar por Função (Map)
        Map<String, List<String>> groupedByRole = new HashMap<>();
        for (Employee employee : employeeList) {
            groupedByRole.computeIfAbsent(employee.getRole(), E -> new ArrayList<>())
                    .add(employee.getName());
        }

        // 3.6 Imprimir Funcionários Agrupados
        for (Map.Entry<String, List<String>> entry : groupedByRole.entrySet()) {
            System.out.println("Função: " + entry.getKey());
            for (String role : entry.getValue()) {
                System.out.println("    " + role);
            }
        }
         */

        // 3.8 Imprimir funcionários com aniversário em 10/12
        List<Employee> Birthdays = employeeList.stream()
            .filter(e -> e.getBirthDate().getMonthValue() == 10 || e.getBirthDate().getMonthValue() == 12).toList();
        System.out.println("Funcionários que fazem aniversário nos meses 10 e 12:");
        Birthdays.forEach(System.out::println);

        // 3.9 Funcionário com Maior Idade
//        Funcionario funcionarioMaisIdade = encontrarFuncionarioMaisVelho(funcionarios);
//        System.out.println("\nFuncionário com Maior Idade:");
//        System.out.println(funcionarioMaisIdade);

        // 3.10 Ordenar por Nome Alfabético
//        Collections.sort(funcionarios, Comparator.comparing(Funcionario::getNome));
//        System.out.println("\nLista de Funcionários Ordenada por Nome:");
//        imprimirFuncionarios(funcionarios);

        // 3.11  Soma o salário de todos os funcionários
//        BigDecimal totalSalarios = funcionarios.stream()
//            .mapToDouble(Funcionario::getSalario)
//            .sum();

//        System.out.println("\nTotal de Salários: R$ " + formatarValor(totalSalarios));

    }
}
