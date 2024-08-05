package com.example.c4.post.service;

import com.example.c4.post.domain.Post;
import com.example.c4.post.dto.PostDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    //임시 db
    List<Post> data = new ArrayList<>();

    private long generateId(){
        if(data.isEmpty()){
            return 1;
        }

//        return data.get(data.size() - 1).getId() + 1;
        return data.getLast().getId() + 1;
    }

    public List<Post> getAllPosts() {
//        data.add(new Post("제목","블로그 내용"));
        return data;
    }

    public Post savePost(PostDTO postDTO) {
        Post post = new Post(postDTO.getTitle(), postDTO.getContent());
        post.setId(generateId());
        data.add(post);
        return post;
    }

    public Post updatePost(Long id, PostDTO postDTO) {

        Post sendData = data.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .map(
                        p -> {
                            p.setTitle(postDTO.getTitle());
                            p.setContent(postDTO.getContent());
                            return p;
                        }
                )
                .orElse(null);

        return sendData;
    }

    public void deletePost(Long id) {
        data.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .ifPresent(post -> data.remove(post))
                ;

        System.out.println("Post Delete Succeed");
    }
}
