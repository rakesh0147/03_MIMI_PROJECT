package in.userregister.binding;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="STATE_MASTER")
public class UserState {
	
	@Id
	private Integer stateId;
	private String stateName;
	private Integer countryId;

}
