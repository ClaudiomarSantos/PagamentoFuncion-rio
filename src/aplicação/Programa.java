package aplicação;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Employee;
import entidades.OutsourcedEmployee;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> emp = new ArrayList<>();

		System.out.println("quantos funcionarios deseja consultar? ");
		int quant = sc.nextInt();

		for (int i = 0; i < quant; i++) {
			System.out.println("Dados do Funcionário " + (i + 1) + " :");
			System.out.println("Funcionario Terceirizado? (s/n) ");
			sc.nextLine();
			String respostaUsuario = sc.nextLine();
			char resp = respostaUsuario.charAt(0);

			if (resp == 's') {

				System.out.println("Name: ");
				String name = sc.nextLine();
				System.out.println("Hours: ");
				int hours = sc.nextInt();
				System.out.println("Value per hour: ");
				double valuePerHour = sc.nextDouble();
				System.out.println("Additional Charge: ");
				double additionalCharge = sc.nextDouble();
				emp.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));

			} else if (resp == 'n') {
				System.out.println("Name: ");
				String name = sc.nextLine();
				System.out.println("Hours: ");
				int hours = sc.nextInt();
				System.out.println("Value per hour: ");
				double valuePerHour = sc.nextDouble();
				emp.add(new Employee(name, hours, valuePerHour));
			} else {
				System.out.println("resposta inválida");

			}

		}
		System.out.println("Pagamentos: ");
		for (int i = 0; i < emp.size(); i++) {
			System.out.printf(emp.get(i).getName() + " - $ " + "%.2f%n", emp.get(i).payment());
			System.out.println();

		}

		sc.close();
	}
}
