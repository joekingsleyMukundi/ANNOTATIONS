package demo2;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{
    @Override
    public String workOut() {
        return "CrossBar challange";
    }
}
