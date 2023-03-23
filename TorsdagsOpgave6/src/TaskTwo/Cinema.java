package TaskTwo;

/* 2.1 Hent klassen Cinema.java og klassen FindFemFejl.java. Kig koden igennem
og dan dig et overblik over hvad den gør.*/

/* 2.3 Find ud af hvorfor koden fejler og ret Cinema til, så koden kører uden fejl.
Der er fem ting, der skal rettes i koden.*/

public class Cinema {
    String[][] seats;

    // Række 0, sæde 0 er altid reserveret til direktøren og skal derfor have værdien X
    // Sæder, der ikke er reserveret, har værdien "O"
    public Cinema(int rows, int seats) {
        this.seats = new String[rows][seats];
        for (int i = 0; i < rows; i++) {
            for (int k = 0; k < seats; k++) {
                this.seats[i][k] = "0";
            }
        }
        this.seats[0][0] = "x";
    }

    public int getRows() {
        return seats.length - 1;
    }

    public int getSeats() {
        return seats[0].length - 1;
    }

    // If the seat is not yet reserved, it's value is O.
    // In that case, change the value to X and return true.
    // If the seat is already reserved, return false.
    public boolean reserve(int row, int seat) {
        if (seats[row][seat].equals("0")) {
            seats[row][seat] = "x";
            return true;
        }
        return false;
    }

    public boolean cancelReservation(int row, int seat) {
        if (seats[row][seat].equals("x")) {
            seats[row][seat] = "0";
            return true;
        }
        return false;
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < seats.length; i++) {
            result += "|";

            for (int j = 0; j < seats[i].length; j++) {
                result += seats[i][j] + "|";
            }
            result += "\n";
        }
        return result;
    }
}

