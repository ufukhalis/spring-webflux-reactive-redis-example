package io.github.ufukhalis.redis.service;

import io.github.ufukhalis.redis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ReactiveRedisTemplate;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class UserRedisService {

    @Autowired
    private ReactiveRedisTemplate<String, User> redisTemplate;

    public Mono<Boolean> put(String key, User user) {
        return redisTemplate.opsForValue().set(key, user);
    }

    public Mono<User> get(String key) {
        return redisTemplate.opsForValue().get(key);
    }

    public Mono<Boolean> delete(String key) {
        return redisTemplate.opsForValue().delete(key);
    }
}
