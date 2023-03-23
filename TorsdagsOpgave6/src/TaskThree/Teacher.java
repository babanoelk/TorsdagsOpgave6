package TaskThree;

import java.util.ArrayList;

public class Teacher extends Person {

    /*3.2: Lav to klasser Student og Teacher, som arver fra Person. Lav konstruktører til klasserne, som kalder Persons
    konstruktør ved at bruge keywordet super().*/

    private ArrayList<String> canTeach;
    private ArrayList<String> currentCourses;

    public Teacher(String name, ArrayList<String> canTeach, ArrayList<String> currentCourses) {
        super(name);
        this.canTeach = canTeach;
        this.currentCourses = currentCourses;
    }

    /* 3.5 Override metoden addCourse i Teacher. Når metoden bliver kaldt, skal du sikre, at kurset ligger i
    underviserens canTeach-ArrayList, da underviseren skal være kvalificeret til at undervise for at
    blive sat på kurset. Hvis underviseren er kvalificeret, lægges kurset i currentCourses. Lad metoden
    returnere true eller false alt efter om kurset blev tilføjet til currentCourses.*/
    @Override
    public boolean addCourse(String course) {
        for (String s : canTeach) {
            if (s.equals(course)) {
                currentCourses.add(course);
                System.out.println(this.name + " kan godt undervise i dette fag.");
                return true;
            }
        }
        System.out.println(this.name + " kan ikke undervise i dette fag.");
        return false;
    }
    /* 3.3 Lav to ArrayList i Student kaldet passedCourses og currentCourses. Lav to ArrayList i Teacher kaldet
    canTeach og currentCourses. Lav om i konstruktørerne, så der skal gives en ArrayList passedCourses eller
    canTeach med som parameter, når objektet oprettes.*/
}
