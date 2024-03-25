package org.beta.datacontext;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@Entity
@Table( name = "userdata" )
public class UserContext {

    @Id
    @Column( name = "pesel" )
    private Integer userPesel;

    @Size( max = 32 )
    @Column( name = "name" )
    private String userName;

    @Size( max = 32 )
    @Email
    @Column( name = "email" )
    private String userEmail;

    @Size( max = 1 )
    @Column( name = "sex")
    private String userSex;

    public UserContext(Integer userPesel, String userName, String userEmail, String userSex) {
        this.userPesel = userPesel;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userSex = userSex;
    }

}
