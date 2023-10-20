package InlamningSprint2;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;
public class PersonUtility {
    public Person GetPersonFromList(String pn, String namn, List<Person> pList) {
        for (Person p : pList) {
           if ((p.getPeronnummer().equalsIgnoreCase(pn)) || (p.getNamn().equalsIgnoreCase(namn)))
                return p;
        }
        return null;
    }
    public Person GreatePerson(String pn, String namn, LocalDate memberDate) {
        Person p = new Person(pn, namn, memberDate);
        return p;
    }
    public boolean HasActiveMembership(Person person) {
      //  System.out.println("period is: " + Period.between(person.getMedlemskapDatum(),LocalDate.now()).getYears());
        if (Period.between(person.getMedlemskapDatum(),LocalDate.now()).getYears()<1)
            return true;
        else return false;
    }
}

      /*public ArrayList<Person> AddPersonToList(Person person, ArrayList<Person> list) {
        list.add(person);
        return list;
    }*/