package com.amarmodi.app.web.rest.vm;

import com.amarmodi.app.domain.User;
import com.amarmodi.app.service.dto.UserDTO;

import java.time.Instant;
import java.util.Set;

import javax.validation.constraints.Size;

/**
 * View Model extending the UserDTO, which is meant to be used in the user management UI.
 */
public class ManagedUserVM extends UserDTO {

    public static final int PASSWORD_MIN_LENGTH = 4;

    public static final int PASSWORD_MAX_LENGTH = 100;

    @Size(min = PASSWORD_MIN_LENGTH, max = PASSWORD_MAX_LENGTH)
    private String password;

    
    
    public ManagedUserVM() {
        // Empty constructor needed for Jackson.
    }

    
    
    public ManagedUserVM(Long id, String login, String firstName, String lastName, String email, boolean activated,
			String imageUrl, String langKey, String createdBy, Instant createdDate, String lastModifiedBy,
			Instant lastModifiedDate, Long homeLocation, Set<String> authorities) {
		super(id, login, firstName, lastName, email, activated, imageUrl, langKey, createdBy, createdDate, lastModifiedBy,
				lastModifiedDate, homeLocation, authorities);
		// TODO Auto-generated constructor stub
	}







	public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "ManagedUserVM{" +
            "} " + super.toString();
    }
}
