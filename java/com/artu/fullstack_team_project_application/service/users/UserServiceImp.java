package com.artu.fullstack_team_project_application.service.users;

import com.artu.fullstack_team_project_application.dto.UserPageDto;
import com.artu.fullstack_team_project_application.entity.postings.UserFollow;
import com.artu.fullstack_team_project_application.entity.users.user.User;
import com.artu.fullstack_team_project_application.entity.users.user.UserInterest;
import com.artu.fullstack_team_project_application.repository.postings.PostingRepository;
import com.artu.fullstack_team_project_application.repository.postings.UserFollowRepository;
import com.artu.fullstack_team_project_application.repository.users.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
@AllArgsConstructor
public class UserServiceImp implements UserService {

    private final UserRepository userRepository;
    private final UserFollowRepository userFollowRepository;
    private final PostingRepository postingRepository;

    @Override
    public Page<User> readAll(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    @Override
    public Optional<User> readOne(String userId) {
        return userRepository.findById(userId);
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public void delete(String userId) {
    }
//
//    @Override
//    public List<UserInterest> readInterests(String userId) {
//        return List.of();
//    }
//
//    @Override
//    public List<UserInterest> saveInterests(UserInterest userInterest) {
//        return List.of();
//    }

    @Override
    public boolean checkUserExists(String userId) {
        return userRepository.existsByUserId(userId);
    }

    @Override
    public boolean checkUserEmailExists(String email) {
        return userRepository.existsByUserEmail(email);
    }

    @Override
    @Transactional(readOnly = true)
    public UserPageDto readUserPage(String userId) {
        Optional<User> userOptional = userRepository.findById(userId);
        UserPageDto userPageDto = new UserPageDto();
        if (userOptional.isPresent()) {
            Long countFollower = userFollowRepository.countFolloweeByUserId(userId);
            Long countFollowee = userFollowRepository.countFollowerByUserId(userId);
            Long countPosting = postingRepository.countpostingByUserId(userId);
            userPageDto.setUser(userOptional.get());
            userPageDto.setCountFollower(countFollower);
            userPageDto.setCountFollowee(countFollowee);
            userPageDto.setCountPosting(countPosting);
            return userPageDto;
        }

        return null;
    }


    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> findByUserId(String userId) {
        return userRepository.findById(userId);
    }

    @Override
    @Transactional(readOnly = true)
    public Set<UserFollow> findByFollowerId(String followerId) {
        return userFollowRepository.findByFollowerId(followerId);
    }

    @Override
    @Transactional(readOnly = true)
    public Set<UserFollow> findByFolloweeId(String followeeId) {
        return userFollowRepository.findByFolloweeId(followeeId);
    }

}
