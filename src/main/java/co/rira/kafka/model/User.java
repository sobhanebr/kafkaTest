package co.rira.kafka.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Data
@Table(name = "users",schema = "public")
@EqualsAndHashCode
public class User {

    @Id
    private String id;
    @NotEmpty
    private String emailAddress;
    @NotEmpty
    private String phoneNumber;

}
