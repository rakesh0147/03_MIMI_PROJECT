package in.userregister.binding;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="CITY_MASTER")
public class UserCity {
	
	@Id
	private Integer cityId;
	private String cityName;
	private Integer stateId;

}
