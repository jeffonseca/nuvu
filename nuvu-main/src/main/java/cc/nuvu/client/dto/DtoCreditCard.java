package cc.nuvu.client.dto;

import cc.nuvu.client.Constant;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import nuvu.client.type.CreditCardType;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = Constant.SWAGGER_SCHEMA_CREDIT_CARD_NAME, description = Constant.SWAGGER_SCHEMA_CREDIT_CARD_DESCRIPTION)
public class DtoCreditCard {

    @Schema(description = Constant.SWAGGER_SCHEMA_CREDIT_CARD_ID_DESCRIPTION,  example = Constant.SWAGGER_SCHEMA_CREDIT_CARD_ID_EXAMPLE, required = false)
    private Long id;

    @NotNull(message = Constant.CONSTRAINT_NOT_NULL)
    @Size(min = Constant.DTO_MIN_NUMBERS_CARD, max = Constant.DTO_MAX_NUMBERS_CARD, message = Constant.CONSTRAINT_SIZE)
    @Schema(description = Constant.SWAGGER_SCHEMA_CREDIT_CARD_NUMBER_DESCRIPTION,  example = Constant.SWAGGER_SCHEMA_CREDIT_CARD_NUMBER_EXAMPLE, required = true)
    private Long number;

    @NotNull(message = Constant.CONSTRAINT_NOT_NULL)
    @Size(min = Constant.DTO_MIN_NUMBERS_CVC, max = Constant.DTO_MAX_NUMBERS_CVC, message = Constant.CONSTRAINT_SIZE)
    @Schema(description = Constant.SWAGGER_SCHEMA_CREDIT_CARD_CVC_DESCRIPTION,  example = Constant.SWAGGER_SCHEMA_CREDIT_CARD_CVC_EXAMPLE, required = true)
    private int cvc;

    @NotNull(message = Constant.CONSTRAINT_NOT_NULL)
    @Schema(description = Constant.SWAGGER_SCHEMA_CREDIT_CARD_ACTIVE_DESCRIPTION,  example = Constant.SWAGGER_SCHEMA_CREDIT_CARD_ACTIVE_EXAMPLE, required = true)
    private boolean active;

    @NotNull(message = Constant.CONSTRAINT_NOT_NULL)
    @Schema(description = Constant.SWAGGER_SCHEMA_CREDIT_CARD_TYPE_DESCRIPTION,  example = Constant.SWAGGER_SCHEMA_CREDIT_CARD_TYPE_EXAMPLE, required = true)
    private CreditCardType creditCardType;
}
