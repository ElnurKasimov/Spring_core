package person;

import lombok.Data;
import place.Place;

@Data
public class Worker implements Person {
    private Place factory;

    @Override
    public void walk() {

    }
}
