package com.fabo.portfolio.controller;

import com.fabo.portfolio.model.Profile;
import com.fabo.portfolio.service.profileService.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProfileController {

    @Autowired
    public ProfileService profileServ;

    @GetMapping("/profiles")
    private List<Profile> getAllProfiles(){
        return profileServ.getAllProfiles();
    }

    @GetMapping("/profiles/{id}")
    private Profile getProfile(@PathVariable Long id){
        return profileServ.getProfile(id);
    }

    @PostMapping("/profiles")
    private String createProfile(@RequestBody Profile profile){
         profileServ.saveProfile(profile);
        return "Profile created successfully";
    }

    @DeleteMapping("/profiles/{id}")
    private String deleteProfile(@PathVariable Long id){
         profileServ.deleteProfile(id);
         return "Profile deleted successfully";
    }

    @PutMapping ("/profiles/{id}")
    private String updateProfile(@RequestBody Profile profile){
        profileServ.saveProfile(profile);
        return "Profile updated successfully";
    }
}
