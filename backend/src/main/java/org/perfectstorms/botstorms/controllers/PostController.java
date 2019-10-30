package org.perfectstorms.botstorms.controllers;

import org.perfectstorms.botstorms.entities.PostEntity;
import org.perfectstorms.botstorms.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {

    private PostRepository postRepository;

    @Autowired
    public PostController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @GetMapping("/posts")
    public List<PostEntity> getAll() {
        return postRepository.findAll();
    }
}
