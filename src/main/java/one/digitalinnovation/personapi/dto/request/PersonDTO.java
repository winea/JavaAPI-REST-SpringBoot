package one.digitalinnovation.personapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

//Classe DTO gerencia todo o banco de dados

//Recebe dados de entrada e mapeia(valida em momento da requisicao http)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {

    private Long id;

    @NotEmpty //validacoes
    @Size(min = 2, max = 100) //validacoes
    private String firstName;

    @NotEmpty
    @Size(min = 2, max = 100)
    private String lastName;

    @NotEmpty
    @CPF
    private String cpf;

    private String birthDate;

    @Valid //tem que validar de acordo regras
    @NotEmpty
    private List<PhoneDTO> phones;
}
