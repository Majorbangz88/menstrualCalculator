package Data.Repositories;

import Data.Models.MenstrualCycle;

public interface MenstrualCycleRepository {

    MenstrualCycle save(MenstrualCycle app);
    MenstrualCycle findById(int id);
    void delete(MenstrualCycle app);
    long count();
    Iterable<MenstrualCycle> findAll();
    void clear();
}
