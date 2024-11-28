package br.com.mateustavares.gestao_vagas.modules.candidate;


import java.util.UUID;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data()
public class CandidateEntity {
    private UUID id;
    private String name;

    @Pattern(regexp = "\\S+", message = "O campo [username] não deve conter espaço")
    private String username;

    @Email(message = "o campo [email] deve conter um e-email válido")
    private String email;

    @Length(min = 10, max = 100, message = "A senha deve conter entre (10) e (100) caracteres")
    private String password;
    private String description;
}
