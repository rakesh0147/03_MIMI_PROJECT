package in.userregister.binding;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="COUNTRY_MASTER")
public class UserCountry {
	
	@Id
	private Integer countryId;
	private String countryName;

}
