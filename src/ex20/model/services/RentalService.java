package ex20.model.services;

import java.time.Duration;

import ex20.model.entities.CarRental;
import ex20.model.entities.Invoice;

public class RentalService {

	private final double pricePerDay;
	private final double pricePerHour;
	private final TaxService taxService;

	public RentalService(double pricePerDay, double pricePerHour, TaxService taxService) {
		if (taxService == null) {
			throw new IllegalArgumentException("O serviço de imposto não pode ser nulo.");
		}
		if (pricePerDay < 0 || pricePerHour < 0) {
			throw new IllegalArgumentException("Os preços não podem ser negativos.");
		}
		this.pricePerDay = pricePerDay;
		this.pricePerHour = pricePerHour;
		this.taxService = taxService;
	}

	public void processInvoice(CarRental carRental) {

		long minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
		if (minutes <= 0) {
			throw new IllegalArgumentException("O retorno precisa ser depois da retirada.");
		}

		double hours = minutes / 60.0;

		double basicPayment;
		if (hours <= 12.0) {
			basicPayment = pricePerHour * Math.ceil(hours);
		}
		else {
			basicPayment = pricePerDay * Math.ceil(hours / 24.0);
		}

		double tax = taxService.tax(basicPayment);

		carRental.setInvoice(new Invoice(basicPayment, tax));
	}
}
