package model.planning;

import model.users.Profile;
import org.joda.time.LocalDate;

import java.util.List;

public class SaturdayNightFeverStrategy implements IPlanningStrategy {

    @Override
    public List<IPlanningResult> search(Profile profile) {
        return null;
    }

    @Override
    public List<IPlanningResult> search(LocalDate date, Profile profile) {
        return null;
    }
}
