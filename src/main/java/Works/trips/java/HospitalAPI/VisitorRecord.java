package Works.trips.java.HospitalAPI;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

@Component
@Entity
public class VisitorRecord extends Record implements PersonRecord {
    @Id
    private Long id;

    public VisitorRecord() {
    }

    @Override
    public String toString() {
        return "Visitor Record: [" +'\n'+
                "name: '" + getName() + '\n' +
                ", firstname: " + "'" + getFirstname()+ '\n' +
                ", timestamp: " + getTimestamp() + '\n'+
                ']';
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
