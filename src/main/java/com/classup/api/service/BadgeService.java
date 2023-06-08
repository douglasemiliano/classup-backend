package com.classup.api.service;

import com.classup.api.models.Badge;
import com.classup.api.repository.BadgeRepository;
import com.classup.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BadgeService {

    @Autowired
    private BadgeRepository badgeRepository;

    @Autowired
    private UserRepository userRepository;

    public List<Badge> getAllBadge(){
        return badgeRepository.findAll();
    }

    public Badge createBadge(Badge badge){
        return badgeRepository.save(badge);
    }

}
