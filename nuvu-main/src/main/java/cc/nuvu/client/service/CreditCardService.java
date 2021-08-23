package cc.nuvu.client.service;

import cc.nuvu.client.dto.DtoClient;
import cc.nuvu.client.dto.DtoCreditCard;
import cc.nuvu.client.model.ModelClient;
import cc.nuvu.client.model.ModelCreditCard;
import cc.nuvu.client.repository.RepositoryClient;
import cc.nuvu.client.repository.RepositoryCreditCard;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

@Service
public class CreditCardService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private RepositoryClient clientRepository;

    @Autowired
    private RepositoryCreditCard creditCardRepository;

    public DtoClient saveClient(DtoClient clientDto){

        var client = modelMapper.map(clientDto, ModelClient.class);
        client = clientRepository.save(client);
        clientDto = modelMapper.map(client, DtoClient.class);
        clientDto.setCreditCardDtos(new HashSet<>());

        for (ModelCreditCard creditCard : client.getCreditCard()) {
            DtoCreditCard auxCreditCard = modelMapper.map(creditCard, DtoCreditCard.class);
            clientDto.getCreditCardDtos().add(auxCreditCard);
        }

        return clientDto;
    }

    public List<DtoClient> getAllClient(){

        List<DtoClient> list = new ArrayList<>();

        for (ModelClient client : clientRepository.findAll()) {

            DtoClient auxClient = modelMapper.map(client, DtoClient.class);
            auxClient.setCreditCardDtos(new HashSet<>());

            for (ModelCreditCard creditCard : client.getCreditCard()) {
                DtoCreditCard auxCreditCard = modelMapper.map(creditCard, DtoCreditCard.class);
                auxClient.getCreditCardDtos().add(auxCreditCard);
            }

            list.add(auxClient);
        }
        return list;
    }

    public DtoClient getClientSearchByNumberDocument(String numberDocument){

        Optional<ModelClient> client = clientRepository.findByDocumentNumber(numberDocument);

        if(client.isPresent()){

            DtoClient auxClient = modelMapper.map(client.get(), DtoClient.class);
            auxClient.setCreditCardDtos(new HashSet<>());

            for (ModelCreditCard creditCard : client.get().getCreditCard()) {
                DtoCreditCard auxCreditCard = modelMapper.map(creditCard, DtoCreditCard.class);
                auxClient.getCreditCardDtos().add(auxCreditCard);
            }

            return auxClient;
        }
        else{
            return null;
        }
    }

    public DtoClient updateDataClientById(DtoClient clientDto, Long numberDocument){

        if(clientRepository.findById(numberDocument).isPresent()){

            var auxUpdateClient = modelMapper.map(clientDto, ModelClient.class);
            auxUpdateClient.setId(numberDocument);
            var client = clientRepository.save(auxUpdateClient);
            DtoClient auxClient = modelMapper.map(client, DtoClient.class);
            auxClient.setCreditCardDtos(new HashSet<>());

            for (ModelCreditCard creditCard : client.getCreditCard()) {
                DtoCreditCard auxCreditCard = modelMapper.map(creditCard, DtoCreditCard.class);
                auxClient.getCreditCardDtos().add(auxCreditCard);
            }
            return auxClient;
        }
        else{
            return null;
        }
    }

}
