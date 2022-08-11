package com.fabo.portfolio.service.profileService;

import com.fabo.portfolio.model.Profile;
import com.fabo.portfolio.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileService implements iProfileService {

    @Autowired
    public ProfileRepository profileRepo;

    @Override
    public List<Profile> getAllProfiles() {
        return (List<Profile>) profileRepo.findAll();
    }

    @Override
    public Profile getProfile(Long id) {
        return profileRepo.findById(id).orElse(null);
    }

    @Override
    public void saveProfile(Profile profile) {
        profileRepo.save(profile);
    }

    @Override
    public void deleteProfile(Long id) {
        profileRepo.deleteById(id);
    }
}
