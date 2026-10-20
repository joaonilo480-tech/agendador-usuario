package com.joao.agendador_usuario.business;

import com.joao.agendador_usuario.business.dto.UsuarioDTO;
import com.joao.agendador_usuario.converter.UsuarioConverter;
import infra.entity.Usuario;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import repository.UsuarioRepository;

@Service
@AllArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioConverter usuarioConverter;

    public UsuarioDTO salvaUsuario(UsuarioDTO usuarioDTO) {
        Usuario usuario = usuarioConverter.paraUsuario(usuarioDTO);
        return usuarioConverter.paraUsuarioDTO(usuarioRepository.save(usuario));
    }
}
