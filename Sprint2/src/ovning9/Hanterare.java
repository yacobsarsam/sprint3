package ovning9;

import java.util.ArrayList;
import java.util.List;

public class Hanterare {
private boolean IsLongPerson (Person p) {
    return  (p.getLength() >= 200);

}
public List<Person> getTallPeopleList(List<Person> personList){
    List<Person> res = new ArrayList<>();
    for (Person p : personList){
        if (IsLongPerson(p))
            res.add(p);
    }
    return res;
}
}

