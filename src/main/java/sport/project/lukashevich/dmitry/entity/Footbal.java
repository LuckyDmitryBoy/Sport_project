package sport.project.lukashevich.dmitry.entity;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "footbal")
public class Footbal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "college_name")
    @NotBlank(message = "College name should not be empty")
    private String collegeName;
    @Column(name = "gender")
    private String gender;
    @Column(name = "date_of_bird")
    @NotBlank(message = "Date of bird should not be empty")
    private String dateOfBird;
    @Column(name = "email")
    @Email(message = "Email should be valid")
    private String email;
    @Column(name = "name")
    @NotBlank(message = "Name should not be empty")
    private String name;
    public Footbal(String collegeName,String gender, String dateOfBird,String email, String name) {
        this.collegeName=collegeName;
        this.gender=gender;
        this.dateOfBird=dateOfBird;
        this.email=email;
        this.name = name;
    }

    public Footbal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateOfBird() {
        return dateOfBird;
    }

    public void setDateOfBird(String dateOfBird) {
        this.dateOfBird = dateOfBird;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
}
