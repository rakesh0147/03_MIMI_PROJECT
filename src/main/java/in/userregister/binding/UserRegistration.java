package in.userregister.binding;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="USER_DTLS")
public class UserRegistration {
	
	@Id
	@GeneratedValue
	private Integer userId;
	private String userFirstName;
	private String userLastName;
	private String userEmail;
	private Long userPhone;
	private Date userDateOfBirth;
	private String userGender;
	private Integer userCountry;
	private Integer userState;
	private Integer userCity;
	private String userPassword;
	private String userAccountStatus;

}
