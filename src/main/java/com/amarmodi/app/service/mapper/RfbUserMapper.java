package com.amarmodi.app.service.mapper;

import com.amarmodi.app.domain.*;
import com.amarmodi.app.service.dto.RfbUserDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity RfbUser and its DTO RfbUserDTO.
 */
@Mapper(componentModel = "spring", uses = {RfbLocationMapper.class})
public interface RfbUserMapper extends EntityMapper<RfbUserDTO, RfbUser> {

    @Mapping(source = "rfbLocation.id", target = "rfbLocationId")
    RfbUserDTO toDto(RfbUser rfbUser); 

    @Mapping(source = "rfbLocationId", target = "rfbLocation")
    RfbUser toEntity(RfbUserDTO rfbUserDTO);

    default RfbUser fromId(Long id) {
        if (id == null) {
            return null;
        }
        RfbUser rfbUser = new RfbUser();
        rfbUser.setId(id);
        return rfbUser;
    }
}
