package TaskTwo;

/*2.1 Hent klassen Cinema.java og klassen FindFemFejl.java. Kig koden igennem
og dan dig et overblik over hvad den gør.*/


public class FindFemFejl {

    // 2.2 Kør main-metoden i FindFemFejl.java. Koden vil fejle.
    public static void main(String[] args) {
        Cinema biogrande = new Cinema(20, 10);
        // Reserver række 1, sæde 5
        System.out.println("Række 1, sæde 5 reserveret: " + biogrande.reserve(0, 4));
        // Afbestil reservation på række 1, sæde 5

        // Reserver det sidste sæde i den sidste række
        int numberOfRows = biogrande.getRows();
        int numberOfSeats = biogrande.getSeats();
        biogrande.reserve(numberOfRows, numberOfSeats);

        // Print hele salen pænt
        System.out.println(biogrande);
        System.out.println("Række 1, sæde 5 er afbestilt: " + biogrande.cancelReservation(0, 4));
        System.out.println(biogrande);
    }
}
