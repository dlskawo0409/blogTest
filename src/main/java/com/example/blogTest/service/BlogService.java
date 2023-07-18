package com.example.blogTest.service;

import com.example.blogTest.domain.Article;
import com.example.blogTest.dto.AddArticleRequest;
import com.example.blogTest.repository.BlogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BlogService {

    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request){
        return blogRepository.save(request.toEntity());
    }
}
