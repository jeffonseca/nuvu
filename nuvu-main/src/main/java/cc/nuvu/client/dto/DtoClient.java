package cc.nuvu.client.dto;

import cc.nuvu.client.Constant;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import nuvu.client.type.DocumentType;

import javax.validation.constraints.*;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = Constant.SWAGGER_SCHEMA_CLIENT_NAME, description = Constant.SWAGGER_SCHEMA_CLIENT_DESCRIPTION)
public class DtoClient {

    @Schema(description = Constant.SWAGGER_SCHEMA_CLIENT_ID_DESCRIPTION,  example = Constant.SWAGGER_SCHEMA_CLIENT_ID_EXAMPLE, required = false)
    private Long id;

    @NotNull(message = Constant.CONSTRAINT_NOT_NULL)
    @NotBlank(message = Constant.CONSTRAINT_NOT_BLANK)
    @NotEmpty(message = Constant.CONSTRAINT_NOT_EMPTY)
    @Schema(description = Constant.SWAGGER_SCHEMA_CLIENT_NAME_DESCRIPTION,  example = Constant.SWAGGER_SCHEMA_CLIENT_NAME_EXAMPLE, required = true)
    private String name;

    @NotNull(message = Constant.CONSTRAINT_NOT_NULL)
    @NotBlank(message = Constant.CONSTRAINT_NOT_BLANK)
    @NotEmpty(message = Constant.CONSTRAINT_NOT_EMPTY)
    @Schema(description = Constant.SWAGGER_SCHEMA_CLIENT_LAST_NAME_DESCRIPTION,  example = Constant.SWAGGER_SCHEMA_CLIENT_LAST_NAME_EXAMPLE, required = true)
    private String lastName;

    @Size(min = Constant.DTO_SIZE_PHONE, max = Constant.DTO_SIZE_PHONE, message = Constant.CONSTRAINT_SIZE)
    @Schema(description = Constant.SWAGGER_SCHEMA_CLIENT_PHONE_DESCRIPTION,  example = Constant.SWAGGER_SCHEMA_CLIENT_PHONE_EXAMPLE, required = false)
    private String phone;

    @Email(message = Constant.CONSTRAINT_EMAIL)
    @Schema(description = Constant.SWAGGER_SCHEMA_CLIENT_EMAIL_DESCRIPTION,  example = Constant.SWAGGER_SCHEMA_CLIENT_EMAIL_EXAMPLE, required = false)
    private String email;

    @Schema(description = Constant.SWAGGER_SCHEMA_CLIENT_ADDRESS_DESCRIPTION,  example = Constant.SWAGGER_SCHEMA_CLIENT_ADDRESS_EXAMPLE, required = false)
    private String address;

    @NotNull(message = Constant.CONSTRAINT_NOT_NULL)
    @Schema(description = Constant.SWAGGER_SCHEMA_CLIENT_DOCUMENT_TYPE_DESCRIPTION,  example = Constant.SWAGGER_SCHEMA_CLIENT_DOCUMENT_TYPE_EXAMPLE, required = true)
    private DocumentType documentType;

    @NotNull(message = Constant.CONSTRAINT_NOT_NULL)
    @Size(min = Constant.DTO_MIN_DOCUMENT_NUMBER, max = Constant.DTO_MAX_DOCUMENT_NUMBER, message = Constant.CONSTRAINT_SIZE)
    @Schema(description = Constant.SWAGGER_SCHEMA_CLIENT_DOCUMENT_NUMBER_DESCRIPTION,  example = Constant.SWAGGER_SCHEMA_CLIENT_DOCUMENT_NUMBER_EXAMPLE, required = true)
    private String documentNumber;

    @Schema(description = Constant.SWAGGER_SCHEMA_CLIENT_STATUS_DESCRIPTION,  example = Constant.SWAGGER_SCHEMA_CLIENT_STATUS_EXAMPLE, required = false)
    private boolean status;

    @Schema(description = Constant.SWAGGER_SCHEMA_CLIENT_CREDIT_CARDS_DESCRIPTION)
    private Set<DtoCreditCard> creditCardDtos;
}
