package Services;

import com.capgemini.accountopening.model.PersonalDetails;

public interface PersonalDetailsService {
 void savePersonalDetails(PersonalDetails personaldetails);
 PersonalDetails getPersonalDetails();
}

