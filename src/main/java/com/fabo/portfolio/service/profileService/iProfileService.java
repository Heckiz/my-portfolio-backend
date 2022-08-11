package com.fabo.portfolio.service.profileService;

import com.fabo.portfolio.model.Profile;

import java.util.List;

public interface iProfileService {
    public abstract List<Profile> getAllProfiles();

    public abstract Profile getProfile(Long id);

    public  abstract  void saveProfile(Profile profile);

    public  abstract  void deleteProfile(Long id);


}
