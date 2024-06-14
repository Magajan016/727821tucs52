package com.example.Service;

import org.springframework.stereotype.Service;

import com.example.Repository.UserRepo;
import com.example.model.User;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepo userRepo;

    public User registerUser(User u) {
        User user1=null;
        user1.setClientID(u.getClientID());
        user1.setClientSecret("HVIQBVbqmTGEmaED");
        user1.setCompanyName(u.getCompanyName());
        user1.setOwnerEmail(u.getOwnerEmail());
        user1.setAccessCode(u.getAccessCode());
        user1.setRollNo(u.getRollNo());
        user1.setOwnerName(u.getOwnerName());
        // userRepo.save(user1);
        return user1;
    }

   
    
}
