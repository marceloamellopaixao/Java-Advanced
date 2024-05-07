package br.com.fiap.model;

import br.com.fiap.controller.UserRequestDTO;
import br.com.fiap.controller.UserResponseDTO;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class UserMapper {
    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public static PetOwner toEntity(final UserRequestDTO dto) {
        return new PetOwner(dto.getUsername(),encoder.encode(dto.getPassword()));
    }

    public static UserResponseDTO toResponse(final PetOwner entity) {
        return new UserResponseDTO(entity.getUsername());
    }
}
