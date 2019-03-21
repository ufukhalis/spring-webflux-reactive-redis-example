package io.github.ufukhalis.redis.controller;

import io.github.ufukhalis.redis.model.User;
import io.github.ufukhalis.redis.service.UserRedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
public class UserController {

    @Autowired
    private UserRedisService userRedisService;

    @PostMapping("/{key}")
    public Mono<Boolean> put(@PathVariable("key") String key,
                             @RequestBody User user) {

        return userRedisService.put(key, user);
    }

    @GetMapping("/{key}")
    public Mono<User> get(@PathVariable("key") String key) {

        return userRedisService.get(key);
    }

    @DeleteMapping("/{key}")
    public Mono<Boolean> delete(@PathVariable("key") String key) {

        return userRedisService.delete(key);
    }
}
