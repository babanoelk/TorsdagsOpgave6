package TaskThree;

import java.util.ArrayList;

public class Student extends Person {
    /* 3.2: Lav to klasser Student og Teacher, som arver fra Person. Lav konstruktører til klasserne, som kalder
    Persons konstruktør ved at bruge keywordet super().*/
    private ArrayList<String> passedCourses;
    private ArrayList<String> currentCourses;

    public Student(String name, ArrayList<String> passedCourses, ArrayList<String> currentCourses) {
        super(name);
        this.passedCourses = passedCourses;
        this.currentCourses = currentCourses;
    }

    /* 3.4 Override metoden addCourse i Student. Når metoden bliver kaldt, skal du sikre, at kurset ikke ligger i den
    studerendes passedCourses-ArrayList, da en studerende ikke kan tage kurser, som allerede er bestået én gang.
    Hvis den studerende ikke tidligere har bestået kurset, lægges det i currentCourses. Lad metoden returnere true
    eller false alt efter om kurset blev tilføjet til currentCourses.*/
    @Override
    public boolean addCourse(String course) {
        for(String s: passedCourses){
            if(s.equals(course)){
                System.out.println(this.name + " har allerede bestået dette fag.");
                return false;
            }
        }
        currentCourses.add(course);
        System.out.println(this.name + " har ikke bestået dette fag.");
        return true;
    }

    /*3.3 Lav to ArrayList i Student kaldet passedCourses og currentCourses. Lav to ArrayList i Teacher kaldet
    canTeach og currentCourses. Lav om i konstruktørerne, så der skal gives en ArrayList af passedCourses eller
    canTeach med, når objektet oprettes.*/
}
