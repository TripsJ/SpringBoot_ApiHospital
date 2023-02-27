package Works.trips.java.HospitalAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/records")
public class Controller {

    @Autowired
    private RecordRepository repo;




   @GetMapping
    public List<Record> findAllRecords() {
        return  repo.findAll();
        // Implement
    }


    @PostMapping("/add/visit")
    public VisitorRecord saveVisit(@Validated @RequestBody VisitorRecord record) {
        return repo.save(record);
    }

    @PostMapping("/add/patient")
    public PatientRecord savePatient(@Validated @RequestBody PatientRecord record) {
        return repo.save(record);
        // Implement
    }

}
