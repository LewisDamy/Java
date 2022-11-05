package application;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Enter rental data");
        System.out.print("Car model: ");
        String carModel = sc.nextLine();

        System.out.print("Pickup (dd/MM/yy hh:ss): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);

        System.out.print("Return (dd/MM/yy hh:ss): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

        // creating a service called RentalService that'll have a method called processInvoice with CarRental type as args

        System.out.print("Enter price per hour: ");
        double pricePerHour = sc.nextDouble();

        System.out.print("Enter price per day: ");
        double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
                                                                                // injection dependence
        /*
            The RentalService receives a generic interface called TaxService and in this case we're passing
            the BrazilTaxService, which will be an UPCASTING (BrazilTaxService(LowerClass) -> TaxService(HighClass)

            The injection of dependence through the constructor:

            The injection of dependence happens when we're instantiating the dependence BrazilTaxService
            in another place, in this case the Main class. This instance BrazilTaxService will be injected through
            the interface TaxService.
         */


        rentalService.processInvoice(cr);

        System.out.println("INVOICE:");
        System.out.println("Basic payment: " + cr.getInvoice().getBasicPayment());

        System.out.println("Tax: " + cr.getInvoice().getTax());

        System.out.println("Total payment: " + cr.getInvoice().getTotalPayment());

        sc.close();

/*
    25/06/2018 10:30
    27/06/2018 14:40
    10.00
    130.00
 */
    }
}