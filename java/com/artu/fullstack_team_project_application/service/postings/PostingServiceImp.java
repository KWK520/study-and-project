package com.artu.fullstack_team_project_application.service.postings;

import com.artu.fullstack_team_project_application.entity.postings.Posting;
import com.artu.fullstack_team_project_application.entity.postings.PostingImage;
import com.artu.fullstack_team_project_application.entity.postings.PostingLike;
import com.artu.fullstack_team_project_application.repository.postings.PostingImageRepository;
import com.artu.fullstack_team_project_application.repository.postings.PostingRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
@AllArgsConstructor
public class PostingServiceImp implements PostingService {
    private PostingRepository postingRepository;
    private final PostingImageRepository postingImageRepository;

    @Override
    public Posting save(Posting posting) {
        return postingRepository.save(posting);
    }

    @Override
    public void remove(Posting posting) {
        postingRepository.delete(posting);
    }

//    @Override
//    public Page<Posting> findAll(Pageable pageable) {
//        return null;
//    }

    @Override
    public Set<Posting> findByUserId(String userId) {
        return postingRepository.findByUser_UserId(userId);
    }

//    @Override
//    public List<PostingImage> findByPost_PostId(Posting postId) {
//        return postingImageRepository.findByPost_PostId(postId);
//    }

//    @Override
//    public Map<String, Long> getUserActivityCounts(Long userNum) {
//        return Map.of();
//    }

//    @Override
//    public List<PostingLike> readAllLikes() {
//        return List.of();
//    }


}
