package cc.nuvu.client;

public class Constant {

    private Constant() { }

    /***** DTO *****/
    public static final int DTO_SIZE_PHONE = 10;
    public static final int DTO_MIN_DOCUMENT_NUMBER = 8;
    public static final int DTO_MAX_DOCUMENT_NUMBER = 10;

    public static final int DTO_MIN_NUMBERS_CARD = 16;
    public static final int DTO_MAX_NUMBERS_CARD = 16;
    public static final int DTO_MIN_NUMBERS_CVC = 3;
    public static final int DTO_MAX_NUMBERS_CVC = 4;

    /***** ENTITY *****/
    public static final String ENTITY_TABLE_CLIENT_NAME = "Clients";
    public static final String ENTITY_TABLE_CLIENT_COLUMN_NAME = "name";
    public static final String ENTITY_TABLE_CLIENT_COLUMN_LAST_NAME = "last_name";
    public static final String ENTITY_TABLE_CLIENT_COLUMN_PHONE = "phone";
    public static final String ENTITY_TABLE_CLIENT_COLUMN_EMAIL = "email";
    public static final String ENTITY_TABLE_CLIENT_COLUMN_ADDRESS = "address";
    public static final String ENTITY_TABLE_CLIENT_COLUMN_DOCUMENT_TYPE = "document_type";
    public static final String ENTITY_TABLE_CLIENT_COLUMN_DOCUMENT_NUMBER = "document_number";
    public static final String ENTITY_TABLE_CLIENT_COLUMN_STATUS = "active";

    public static final String ENTITY_TABLE_CREDIT_CARD_NAME = "CreditCard";
    public static final String ENTITY_TABLE_CREDIT_CARD_COLUMN_NUMBER = "number";
    public static final String ENTITY_TABLE_CREDIT_CARD_COLUMN_CODE = "code";
    public static final String ENTITY_TABLE_CREDIT_CARD_COLUMN_ACTIVE = "active";
    public static final String ENTITY_TABLE_CREDIT_CARD_COLUMN_TYPE = "type";
    public static final String ENTITY_TABLE_CREDIT_CARD_COLUMN_FK_CLIENT = "client_id";

    /***** MAPPING VALUES *****/
    public static final String MAPPING_CREATE_CLIENT = "/create-client";
    public static final String MAPPING_ALL_CLIENTS = "/all-clients";
    public static final String MAPPING_CLIENT_BY_ID = "/get-clients-id/{numberDocument}";
    public static final String MAPPING_UPDATE_CLIENT_BY_ID = "/update-client/{id}";
    public static final String MAPPING_AUTHENTICATION_APP = "/authentication";

    public static final String MAPPING_CODE_OK = "200";
    public static final String MAPPING_CODE_CREATE = "201";
    public static final String MAPPING_CODE_BAD_REQUEST = "400";

    /***** SWAGGER *****/
    public static final String SWAGGER_TITLE = "Tarjeta de Crédito";
    public static final String SWAGGER_DESCRIPTION = "Aplicación para manejo de información de clientes y tarjetas de crédito asociada";
    public static final String SWAGGER_TERM_OF_USE = "http://swagger.io/terms/";
    public static final String SWAGGER_CONTACT_NAME = "Ana Milena Delgado Gomez";
    public static final String SWAGGER_CONTACT_EMAIL = "ana.delgado.gomez0127@gmail.com";
    public static final String SWAGGER_LICENSE_NAME = "GNU";
    public static final String SWAGGER_LICENSE_URL = "https://es.wikipedia.org/wiki/GNU_General_Public_License";

    public static final String SWAGGER_CONTROLLER_TITLE = "Registra la información del cliente";
    public static final String SWAGGER_CONTROLLER_DESCRIPTION = "Registra la información del cliente";

    public static final String SWAGGER_CONTROLLER_MAPPING_CREATE_CLIENT_DESCRIPTION = "Registra la información del cliente";
    public static final String SWAGGER_CONTROLLER_MAPPING_CREATE_CLIENT_DESCRIPTION_CREATE = "Registro de cliente exitoso";
    public static final String SWAGGER_CONTROLLER_MAPPING_CREATE_CLIENT_DESCRIPTION_BAD_REQUEST = "Algunos datos no son validos";
    public static final String SWAGGER_CONTROLLER_MAPPING_GET_ALL_CLIENT_DESCRIPTION_OK = "Consulta todos los clientes y su información de tarjetas de crédito";
    public static final String SWAGGER_CONTROLLER_MAPPING_GET_CLIENT_BY_ID_DESCRIPTION_OK = "Consulta información del cliente buscando por numero de identificación";
    public static final String SWAGGER_CONTROLLER_MAPPING_UPDATE_CLIENT_BY_ID_DESCRIPTION_OK = "Consulta cliente por Id y modifica información";

    public static final String SWAGGER_SCHEMA_CLIENT_NAME = "Client";
    public static final String SWAGGER_SCHEMA_CLIENT_DESCRIPTION = "Información de datos del cliente";
    public static final String SWAGGER_SCHEMA_CLIENT_ID_DESCRIPTION = "Id de identificacion de los datos del cliente, asociados a la base de datos";
    public static final String SWAGGER_SCHEMA_CLIENT_ID_EXAMPLE = "27";
    public static final String SWAGGER_SCHEMA_CLIENT_NAME_DESCRIPTION = "Nombre del cliente";
    public static final String SWAGGER_SCHEMA_CLIENT_NAME_EXAMPLE = "Ana Milena";
    public static final String SWAGGER_SCHEMA_CLIENT_LAST_NAME_DESCRIPTION = "Apellidos del cliente";
    public static final String SWAGGER_SCHEMA_CLIENT_LAST_NAME_EXAMPLE = "Delgado Gomez";
    public static final String SWAGGER_SCHEMA_CLIENT_PHONE_DESCRIPTION = "Número de Teléfono del cliente";
    public static final String SWAGGER_SCHEMA_CLIENT_PHONE_EXAMPLE = "3174403026";
    public static final String SWAGGER_SCHEMA_CLIENT_EMAIL_DESCRIPTION = "Email del cliente";
    public static final String SWAGGER_SCHEMA_CLIENT_EMAIL_EXAMPLE = "ana.delgado.gomez0127@gmail.com";
    public static final String SWAGGER_SCHEMA_CLIENT_ADDRESS_DESCRIPTION = "Dirección del cliente";
    public static final String SWAGGER_SCHEMA_CLIENT_ADDRESS_EXAMPLE = "Calle 10 # 34 - 56";
    public static final String SWAGGER_SCHEMA_CLIENT_DOCUMENT_TYPE_DESCRIPTION = "Tipo de documento asociado a el cliente";
    public static final String SWAGGER_SCHEMA_CLIENT_DOCUMENT_TYPE_EXAMPLE = "Cedula de Ciudadania";
    public static final String SWAGGER_SCHEMA_CLIENT_DOCUMENT_NUMBER_DESCRIPTION = "Número de documento asociado a el cliente";
    public static final String SWAGGER_SCHEMA_CLIENT_DOCUMENT_NUMBER_EXAMPLE = "16578001";
    public static final String SWAGGER_SCHEMA_CLIENT_STATUS_DESCRIPTION = "Consulta si el cliente esta activo o inactivo";
    public static final String SWAGGER_SCHEMA_CLIENT_STATUS_EXAMPLE = "true";
    public static final String SWAGGER_SCHEMA_CLIENT_CREDIT_CARDS_DESCRIPTION = "Vector con todas las tarjetas de crédito asociada a el cliente";

    public static final String SWAGGER_SCHEMA_CREDIT_CARD_NAME = "Credit Card";
    public static final String SWAGGER_SCHEMA_CREDIT_CARD_DESCRIPTION = "Información de tajeta de crédito";
    public static final String SWAGGER_SCHEMA_CREDIT_CARD_ID_DESCRIPTION = "Código de identificación de la tarjeta de crédito";
    public static final String SWAGGER_SCHEMA_CREDIT_CARD_ID_EXAMPLE = "12";
    public static final String SWAGGER_SCHEMA_CREDIT_CARD_NUMBER_DESCRIPTION = "Número de la tarjeta de crédito";
    public static final String SWAGGER_SCHEMA_CREDIT_CARD_NUMBER_EXAMPLE = "3456010091237711";
    public static final String SWAGGER_SCHEMA_CREDIT_CARD_CVC_DESCRIPTION = "Código de seguridad asociado a la tarjeta";
    public static final String SWAGGER_SCHEMA_CREDIT_CARD_CVC_EXAMPLE = "9101";
    public static final String SWAGGER_SCHEMA_CREDIT_CARD_ACTIVE_DESCRIPTION = "Valida si la tarjeta esta activa o inactiva";
    public static final String SWAGGER_SCHEMA_CREDIT_CARD_ACTIVE_EXAMPLE = "true";
    public static final String SWAGGER_SCHEMA_CREDIT_CARD_TYPE_DESCRIPTION = "Asocia una franquicia de tarjeta de crédito";
    public static final String SWAGGER_SCHEMA_CREDIT_CARD_TYPE_EXAMPLE = "VISA";

    /***** CONSTRAINT *****/
    public static final String CONSTRAINT_NOT_NULL = "El campo no debe de ser nulo";
    public static final String CONSTRAINT_NOT_BLANK = "El campo no debe de estar en blanco";
    public static final String CONSTRAINT_NOT_EMPTY = "El campo no debe de ser vacio";
    public static final String CONSTRAINT_SIZE = "El campo no contiene la cantidad de caracteres exigido";
    public static final String CONSTRAINT_EMAIL = "El campo ingresado no tiene el formato de email requerido";

    /***** LOGS *****/
    public static final String LOG_RECEIVE_DATA = "Registro de información: {}";
    public static final String LOG_RESPONSE_DATA = "Datos de respuesta: {}";

    public static final String LOG_ERROR_VALIDATION = "Error validando información de Ingreso: {}";

    /***** ERROR RESPONSE *****/
    public static final String REST_ERROR_RESPONSE_DATE_TIME = "Fecha Hora";
    public static final String REST_ERROR_RESPONSE_ERRORS = "Errores";
    public static final String REST_ERROR_RESPONSE_DATE_TIME_FORMATTER = "yyyy-MM-dd HH:mm";

    /***** CONFIG TOKEN *****/
    public static final String ID_TOKEN = "Nuvu";
    public static final String CLAIM_NAME = "authorities";
    public static final int EXPIRATION = 600000;
    public static final String AUTHORITY = "ROLE_USER";
    public static final String SECRET_KEY ="mySecretKey";
    public static final String HEADER ="Authorization";
    public static final String PREFIX ="Bearer ";
}
