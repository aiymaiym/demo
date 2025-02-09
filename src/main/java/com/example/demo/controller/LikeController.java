package com.example.demo.controller;

import com.example.demo.service.LikeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/likes")
public class LikeController {
    private final LikeService likeService;

    public LikeController(LikeService likeService) {
        this.likeService = likeService;
    }

    @PostMapping("/{postId}/user/{userId}")
    public String likeOrUnlikePost(@PathVariable Long postId, @PathVariable Long userId) {
        return likeService.toggleLike(postId, userId);
    }
}
