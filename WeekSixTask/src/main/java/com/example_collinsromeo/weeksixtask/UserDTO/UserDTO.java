package com.example_collinsromeo.weeksixtask.UserDTO;

import com.example_collinsromeo.weeksixtask.Enum.Gender;
import com.example_collinsromeo.weeksixtask.Model.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.management.relation.Role;
import java.sql.ResultSet;
import java.sql.SQLException;


@Data
//@AllArgsConstructor
@Builder
public class UserDTO {
    private long id;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private Role role;
    private Gender gender;

    public UserDTO(long id, String firstname, String lastname, String email, String password, Role role,Gender gender) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.role = role;
        this.gender = gender;
    }

    public UserDTO(ResultSet resultSet)throws SQLException{
        this.email = resultSet.getNString("1");
        this.firstname = resultSet.getString("1");
        this.id = resultSet.getLong("1");
        this.lastname = resultSet.getString("1");
        this.password = resultSet.getString("1");
    }
}



//    public UserDTO(User user){
//        this.firstname = user.getFirstname();
//        this.lastname =  user.getLastname();
//        this.email = user.getPassword();
//        this.password = user.getPassword();
//    }
//
//    public UserDTO(ResultSet resultSet) throws SQLException {
//
//        this.email = resultSet.getString(1);
//        this.password = resultSet.getString(1);
//        this.firstname = resultSet.getString(1);
//        this.lastname =  resultSet.getString(1);
//    }
//}