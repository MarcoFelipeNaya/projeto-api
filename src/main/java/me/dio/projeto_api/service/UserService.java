package me.dio.projeto_api.service;

import me.dio.projeto_api.domain.model.User;

public interface UserService {

    me.dio.projeto_api.domain.model.User findById(Long id);

    User create(User userToCreate);
}
