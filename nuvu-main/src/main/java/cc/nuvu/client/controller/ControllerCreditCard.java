package cc.nuvu.client.controller;

import cc.nuvu.client.Constant;
import cc.nuvu.client.dto.DtoClient;
import cc.nuvu.client.service.CreditCardService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@RestController
@Tag(name = Constant.SWAGGER_CONTROLLER_TITLE, description = Constant.SWAGGER_CONTROLLER_DESCRIPTION)
public class ControllerCreditCard {

    @Autowired
    CreditCardService creditCardService;

    @PostMapping(value = Constant.MAPPING_CREATE_CLIENT)
    @Operation(summary = Constant.SWAGGER_CONTROLLER_MAPPING_CREATE_CLIENT_DESCRIPTION)
    @ApiResponses(value = {
            @ApiResponse(responseCode = Constant.MAPPING_CODE_CREATE, description = Constant.SWAGGER_CONTROLLER_MAPPING_CREATE_CLIENT_DESCRIPTION_CREATE, content = { @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = DtoClient.class)) }),
            @ApiResponse(responseCode = Constant.MAPPING_CODE_BAD_REQUEST, description = Constant.SWAGGER_CONTROLLER_MAPPING_CREATE_CLIENT_DESCRIPTION_BAD_REQUEST, content = @Content)
    })
    public ResponseEntity<DtoClient> insertClientData(@Valid @RequestBody DtoClient clientDto){

        log.info(Constant.LOG_RECEIVE_DATA, clientDto);
        clientDto = creditCardService.saveClient(clientDto);
        log.info(Constant.LOG_RESPONSE_DATA, clientDto);

        return new ResponseEntity<>(clientDto, HttpStatus.CREATED);
    }

    @GetMapping(value = Constant.MAPPING_ALL_CLIENTS)
    @ApiResponses(value = {
            @ApiResponse(responseCode = Constant.MAPPING_CODE_OK, description = Constant.SWAGGER_CONTROLLER_MAPPING_GET_ALL_CLIENT_DESCRIPTION_OK, content = { @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = DtoClient.class)) }),
    })
    public ResponseEntity<List<DtoClient>> getAllClients(){

        List<DtoClient> list = creditCardService.getAllClient();
        log.info(Constant.LOG_RESPONSE_DATA, list);

        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping(value = Constant.MAPPING_CLIENT_BY_ID)
    @ApiResponses(value = {
            @ApiResponse(responseCode = Constant.MAPPING_CODE_OK, description = Constant.SWAGGER_CONTROLLER_MAPPING_GET_CLIENT_BY_ID_DESCRIPTION_OK, content = { @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = DtoClient.class)) }),
    })
    public ResponseEntity<DtoClient> getClientById(@PathVariable String numberDocument){

        log.info(Constant.LOG_RECEIVE_DATA, numberDocument);
        DtoClient clientDto = creditCardService.getClientSearchByNumberDocument(numberDocument);
        log.info(Constant.LOG_RESPONSE_DATA, clientDto);

        if(clientDto != null){
            return new ResponseEntity<>(clientDto, HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(clientDto, HttpStatus.NO_CONTENT);
        }
    }

    @PutMapping(value = Constant.MAPPING_UPDATE_CLIENT_BY_ID)
    @Operation(summary = Constant.SWAGGER_CONTROLLER_MAPPING_UPDATE_CLIENT_BY_ID_DESCRIPTION_OK)
    @ApiResponses(value = {
            @ApiResponse(responseCode = Constant.MAPPING_CODE_CREATE, description = Constant.SWAGGER_CONTROLLER_MAPPING_CREATE_CLIENT_DESCRIPTION_CREATE, content = { @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = DtoClient.class)) }),
    })
    public ResponseEntity<DtoClient> updateClientData(@Valid @RequestBody DtoClient clientDto, @PathVariable Long id){

        log.info(Constant.LOG_RECEIVE_DATA, clientDto);
        clientDto = creditCardService.updateDataClientById(clientDto, id);
        log.info(Constant.LOG_RESPONSE_DATA, clientDto);

        return new ResponseEntity<>(clientDto, HttpStatus.CREATED);
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, Object> handleValidationExceptions(MethodArgumentNotValidException ex) {

        Map<String, Object> response = new HashMap<>();

        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach(error -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });

        log.error(Constant.LOG_ERROR_VALIDATION, errors);

        var formatter = DateTimeFormatter.ofPattern(Constant.REST_ERROR_RESPONSE_DATE_TIME_FORMATTER);
        response.put(Constant.REST_ERROR_RESPONSE_DATE_TIME, LocalDateTime.now().format(formatter));
        response.put(Constant.REST_ERROR_RESPONSE_ERRORS, errors);

        return response;
    }
}
