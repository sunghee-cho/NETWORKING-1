package com.example.networking.social.entity;

import java.time.LocalDateTime;

import com.example.networking.dto.Users;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "post_id", nullable = false)
    private Post post;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false, referencedColumnName = "no") // referencedColumnName = "no" 추가
    private Users user;

    @Column(name = "content_comment", nullable = true, length = 255) // 새로 추가
    private String contentComment;

    // 새로 추가
    @Column(name = "created_at")
    private LocalDateTime createdAt;

}