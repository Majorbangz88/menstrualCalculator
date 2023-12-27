package Data.Repositories;

import Data.Models.MenstrualCycle;

import java.util.ArrayList;
import java.util.List;

public class MenstrualCycleRepositoryImpl implements MenstrualCycleRepository{

    private int count;
    private final List<MenstrualCycle> cycleApp = new ArrayList<>();

    @Override
    public MenstrualCycle save(MenstrualCycle app) {
        return null;
    }

    @Override
    public MenstrualCycle findById(int id) {
        return null;
    }

    @Override
    public void delete(MenstrualCycle app) {

    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public Iterable<MenstrualCycle> findAll() {
        return null;
    }

    @Override
    public void clear() {

    }
}
