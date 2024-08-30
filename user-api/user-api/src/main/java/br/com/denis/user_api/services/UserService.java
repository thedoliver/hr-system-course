package br.com.denis.user_api.services;

import br.com.denis.user_api.domain.User;

import java.util.List;

public interface UserService {

    User findById(Long id);
    List<User> findAll();
}
