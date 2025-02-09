package com.example.demo.controller;

import com.example.demo.entities.Comment;
import com.example.demo.service.CommentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comments")
public class CommentController {
    private final CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @PostMapping("/{postId}/user/{userId}")
    public Comment addComment(@PathVariable Long postId, @PathVariable Long userId, @RequestBody String content) {
        return commentService.addComment(postId, userId, content);
    }

    @GetMapping("/{postId}")
    public List<Comment> getComments(@PathVariable Long postId) {
        return commentService.getCommentsByPost(postId);
    }
}
