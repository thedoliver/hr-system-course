package br.com.denis.user_api.services.impl;

import br.com.denis.user_api.domain.User;
import br.com.denis.user_api.repositories.UserRepository;
import br.com.denis.user_api.services.UserService;
import br.com.denis.user_api.services.exceptions.ObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private final UserRepository repository;

    @Override
    public User findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Object Not Found")) ;
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }
}
