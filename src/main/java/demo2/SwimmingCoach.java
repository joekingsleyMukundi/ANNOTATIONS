package demo2;

import org.springframework.stereotype.Component;

@Component
public class SwimmingCoach implements Coach{
    @Override
    public String workOut() {
        return "back stroke the whole day";
    }
}
