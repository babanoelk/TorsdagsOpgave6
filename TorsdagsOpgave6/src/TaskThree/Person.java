package TaskThree;

public abstract class Person {

    /*Her skal vi arbejde med tre klasser hvor de to arver fra den tredje. Vi skal se hvad der sker, når
    to subklasser (children) implementerer en metode forskelligt og vi skal se hvordan subklasser kan behandles som
    deres superklasser. 3.1 Lav en klasse Person, med feltet name. Lav også en konstruktør og relevant getter- og
    setter-metode. Lav derudover metoden boolean addCourse(String course).
    Metoden skal ikke gøre noget, så du kan lade den returnere true og ikke gøre andet (en dummy-metode).*/

    String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract boolean addCourse(String course);
}
