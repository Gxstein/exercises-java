package ex20.application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;

import ex20.model.entities.CarRental;
import ex20.model.entities.Vehicle;
import ex20.model.services.BrazilTaxService;
import ex20.model.services.RentalService;
import ex20.model.services.TaxService;

public class Program {

	private static final DateTimeFormatter FMT = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("Entre com os dados do aluguel");
			System.out.print("Modelo do carro: ");
			String carModel = sc.nextLine().trim();

			System.out.print("Retirada (dd/MM/yyyy HH:mm): ");
			LocalDateTime start = readDateTime(sc);

			System.out.print("Retorno (dd/MM/yyyy HH:mm): ");
			LocalDateTime finish = readDateTime(sc);

			if (!finish.isAfter(start)) {
				System.out.println("Erro: o retorno precisa ser depois da retirada.");
				return;
			}

			CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

			System.out.print("Entre com o preço por hora: ");
			double pricePerHour = readDouble(sc);

			System.out.print("Entre com o preço por dia: ");
			double pricePerDay = readDouble(sc);

			TaxService taxService = new BrazilTaxService();
			RentalService rentalService = new RentalService(pricePerDay, pricePerHour, taxService);

			rentalService.processInvoice(cr);

			System.out.println("FATURA:");
			System.out.printf("Pagamento basico: %.2f%n", cr.getInvoice().getBasicPayment());
			System.out.printf("Imposto: %.2f%n", cr.getInvoice().getTax());
			System.out.printf("Pagamento total: %.2f%n", cr.getInvoice().getTotalPayment());
		}
		catch (NoSuchElementException e) {
			System.out.println("Entrada encerrada.");
		}
	}

	private static LocalDateTime readDateTime(Scanner sc) {
		while (true) {
			String line = sc.nextLine().trim();
			try {
				return LocalDateTime.parse(line, FMT);
			}
			catch (DateTimeParseException e) {
				System.out.print("Data inválida, use dd/MM/yyyy HH:mm: ");
			}
		}
	}

	private static double readDouble(Scanner sc) {
		while (true) {
			String line = sc.nextLine().trim().replace(",", ".");
			try {
				return Double.parseDouble(line);
			}
			catch (NumberFormatException e) {
				System.out.print("Valor inválido, digite apenas números: ");
			}
		}
	}
}
