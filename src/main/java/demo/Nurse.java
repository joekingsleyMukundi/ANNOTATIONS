package demo;

import org.springframework.stereotype.Component;

@Component
public class Nurse implements Staff {
    public String assisting(){
        return "dor amigos";
    }

    @Override
    public String workType() {
        return "assist doc";
    }
}
