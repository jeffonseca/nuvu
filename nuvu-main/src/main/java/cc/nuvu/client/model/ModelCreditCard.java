package cc.nuvu.client.model;

import cc.nuvu.client.Constant;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import nuvu.client.type.CreditCardType;

import javax.persistence.*;

@Data
@Entity
@Table(name = Constant.ENTITY_TABLE_CREDIT_CARD_NAME)
public class ModelCreditCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = Constant.ENTITY_TABLE_CREDIT_CARD_COLUMN_NUMBER)
    private Long number;

    @Column(name = Constant.ENTITY_TABLE_CREDIT_CARD_COLUMN_CODE)
    private int cvc;

    @Column(name = Constant.ENTITY_TABLE_CREDIT_CARD_COLUMN_ACTIVE)
    private boolean active;

    @Column(name = Constant.ENTITY_TABLE_CREDIT_CARD_COLUMN_TYPE)
    @Enumerated(EnumType.STRING)
    private CreditCardType creditCardType;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name=Constant.ENTITY_TABLE_CREDIT_CARD_COLUMN_FK_CLIENT)
    @JsonBackReference
    private ModelClient client;
}
