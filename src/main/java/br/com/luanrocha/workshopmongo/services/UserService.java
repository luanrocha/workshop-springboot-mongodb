package br.com.luanrocha.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.luanrocha.workshopmongo.domain.User;
import br.com.luanrocha.workshopmongo.repository.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository repo;
    
    public List<User> findAll() {
	return repo.findAll();
    }
}
