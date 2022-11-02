package person;

import lombok.Data;
import place.Place;

@Data
public class Pupil implements Person{
    private Place school;


    @Override
    public void walk() {

    }
}
