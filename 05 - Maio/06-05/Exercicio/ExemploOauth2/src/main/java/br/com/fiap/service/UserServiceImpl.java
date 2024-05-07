package br.com.fiap.service;

import br.com.fiap.controller.UserRequestDTO;
import br.com.fiap.controller.UserResponseDTO;
import br.com.fiap.model.PetOwner;
import br.com.fiap.model.UserMapper;
import br.com.fiap.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {

    @Autowired
    private  UserRepository repository;

    public UserResponseDTO create(final UserRequestDTO rq) {
        final PetOwner petOwner = UserMapper.toEntity(rq);
        final PetOwner result = this.repository.save(petOwner);
        return UserMapper.toResponse(result);
    }
}
