package Works.trips.java.HospitalAPI;


import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class RecordRepository  {
    ArrayList<Record> repo;

    public RecordRepository(ArrayList<Record> repo) {
        this.repo = repo;
    }

    public <S extends Record> S save(S entity) {
        repo.add(entity);

        return entity;
    }

    public ArrayList<Record> findAll() {
        return repo;
    }

}

