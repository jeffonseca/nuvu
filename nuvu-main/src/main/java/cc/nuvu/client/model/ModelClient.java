package cc.nuvu.client.model;

import cc.nuvu.client.Constant;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import nuvu.client.type.DocumentType;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = Constant.ENTITY_TABLE_CLIENT_NAME)
public class ModelClient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = Constant.ENTITY_TABLE_CLIENT_COLUMN_NAME)
    private String name;

    @Column(name = Constant.ENTITY_TABLE_CLIENT_COLUMN_LAST_NAME)
    private String lastName;

    @Column(name = Constant.ENTITY_TABLE_CLIENT_COLUMN_PHONE)
    private String phone;

    @Column(name = Constant.ENTITY_TABLE_CLIENT_COLUMN_EMAIL)
    private String email;

    @Column(name = Constant.ENTITY_TABLE_CLIENT_COLUMN_ADDRESS)
    private String address;

    @Column(name = Constant.ENTITY_TABLE_CLIENT_COLUMN_DOCUMENT_TYPE)
    @Enumerated(EnumType.STRING)
    private DocumentType documentType;

    @Column(name = Constant.ENTITY_TABLE_CLIENT_COLUMN_DOCUMENT_NUMBER)
    private String documentNumber;

    @Column(name = Constant.ENTITY_TABLE_CLIENT_COLUMN_STATUS)
    private boolean status;

    @OneToMany(targetEntity=ModelCreditCard.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonManagedReference
    private Set<ModelCreditCard> creditCard;
}
