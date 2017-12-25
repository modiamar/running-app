package com.amarmodi.app.service.dto;


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * A DTO for the RfbUser entity.
 */
public class RfbUserDTO implements Serializable {

    private Long id;

    private String username;

    private Long rfbLocationId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getRfbLocationId() {
        return rfbLocationId;
    }

    public void setRfbLocationId(Long rfbLocationId) {
        this.rfbLocationId = rfbLocationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        RfbUserDTO rfbUserDTO = (RfbUserDTO) o;
        if(rfbUserDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), rfbUserDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "RfbUserDTO{" +
            "id=" + getId() +
            ", username='" + getUsername() + "'" +
            "}";
    }
}
