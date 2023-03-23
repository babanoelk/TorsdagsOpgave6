package TaskThree;

import java.util.ArrayList;

public class Main {

    /* 3.6 Lav en klasse Main med en main-metode, hvor du tester Student og Teacher.
    Du skal oprette et antal studerende og et antal undervisere og give dem ArrayLists af Strings
    (beståede kurser til de studerende og canTeach-kurser til underviserne). Gem alle dine objekter
    i en ArrayList persons.*/
    public static void main(String[] args) {

        ArrayList<String> Courses1 = new ArrayList<>();
        Courses1.add("Dansk");
        Courses1.add("Java 1.0");
        Courses1.add("Matematik");
        ArrayList<String> Courses2 = new ArrayList<>();
        Courses2.add("Dansk");
        ArrayList<String> currentCursesS = new ArrayList<>();
        ArrayList<String> currentCursesSS = new ArrayList<>();

        Student s1 = new Student("Student1", Courses1, currentCursesS);
        Student s2 = new Student("Student2",Courses2,currentCursesSS);

        ArrayList<String> canTeach1 = new ArrayList<>();
        canTeach1.add("Dansk");
        canTeach1.add("Engelsk");
        canTeach1.add("Java 1.0");
        ArrayList<String> canTeach2 = new ArrayList<>();
        canTeach2.add("Dansk");
        ArrayList<String> currentCoursesT = new ArrayList<>();
        ArrayList<String> currentCoursesTT = new ArrayList<>();

        Teacher t1 = new Teacher("Teacher1", canTeach1, currentCoursesT);
        Teacher t2 = new Teacher("Teacher2", canTeach2, currentCoursesTT);

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(s1);
        persons.add(t1);
        persons.add(t2);
        persons.add((s2));

        /*3.7 Kør din persons-liste igennem med en for-løkke og tilføj kurset "Java 1.0" til dem alle
        (sørg for at nogle af dine studerende allerede har bestået dette og andre ikke har, samt at nogle af
        underviserne er kvalificerede til at undervise i det og andre ikke er).

        Hver gang ét af dine kald til addCourse() returnerer false, skal du printe navnet på den studerende
        eller underviseren.

        Hvis det er en Student skal du også printe " har allerede bestået dette kursus." og hvis det er en
        Teacher skal du også printe " kan ikke undervise i dette fag".*/

        for (Person p : persons) {
            p.addCourse("Java 1.0");
        }
    }
}
