package Works.trips.java.HospitalAPI;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@Entity
public class PatientRecord extends Record implements PersonRecord{

    @Id
    private Long id;

    public PatientRecord() {
    }

    private String VisitedDoctor;

    public String getVisitedDoctor() {
        return VisitedDoctor;
    }

    public void setVisitedDoctor(String visitedDoctor) {
        VisitedDoctor = visitedDoctor;
    }

    @Override
    public String toString() {
        return "Patient Record: [" +'\n'+
                "Visited Doctor: " + getVisitedDoctor() + '\n' +
                "name: " + getName() + '\n' +
                ", firstname: " + "'" + getFirstname()+ '\n' +
                ", timestamp: " + getTimestamp() +
                '\n'+']';
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
