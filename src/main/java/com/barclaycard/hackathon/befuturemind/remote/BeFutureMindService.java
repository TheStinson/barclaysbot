package com.barclaycard.hackathon.befuturemind.remote;

import com.barclaycard.hackathon.befuturemind.model.Account;
import com.barclaycard.hackathon.befuturemind.model.SenderSession;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.gen.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * Created by vbhatia on 11/23/2017.
 */
@Service
public class BeFutureMindService {

    @Autowired
    RestTemplate servicesRestTemplate;

    @Value("${remote.banksvc.endpoint}")
    String baseUrl;

    public AccountDetails getAccount(String ASID) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.TEXT_HTML);
        HttpEntity<String> entity = new HttpEntity("parameters", headers);
        String url = baseUrl+"/account/details/"+ASID;
        AccountDetails accountDetails = servicesRestTemplate.getForObject(url, AccountDetails.class);
        return accountDetails;
    }

    public List<Transaction> getTransactions(String ASID) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.TEXT_HTML);
        HttpEntity<String> entity = new HttpEntity("parameters", headers);
        String url = baseUrl+"/account/transactions/last/"+ASID;
        List <Transaction> transactions = servicesRestTemplate.getForObject(url, List.class);
        return transactions;
    }


    public Branch getBranch(String ASID) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.TEXT_HTML);
        HttpEntity<String> entity = new HttpEntity("parameters", headers);
        String url = baseUrl+"/account/branch/"+ASID;
        Branch branch = servicesRestTemplate.getForObject(url, Branch.class);
        return branch;
    }


    public OfferDetails getOffer(String ASID, String category) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.TEXT_HTML);
        HttpEntity<String> entity = new HttpEntity("parameters", headers);
        String url = baseUrl+"/offer/"+ASID+"/"+category;
        OfferDetails offerDetails = servicesRestTemplate.getForObject(url, OfferDetails.class);
        return offerDetails;
    }



    public SenderSession getSenderSession(String senderId) {
        SenderSession senderSession = servicesRestTemplate.getForObject(baseUrl+"sendersession/" + senderId, SenderSession.class);
        return senderSession;
    }

    public SenderSession saveSenderSession(String senderId) {
        SenderSession senderSessionRequest = new SenderSession();
        senderSessionRequest.setAuthenticatedFlag(true);
        senderSessionRequest.setLastLoginTS(new Timestamp(new Date().getTime()));
        SenderSession senderSession = servicesRestTemplate.postForObject(baseUrl+"sendersession", senderSessionRequest, SenderSession.class);
        return senderSession;
    }

    public SenderSession updateSenderSession(SenderSession senderSessionRequest) {
        senderSessionRequest.setSessionStarted(false);
        senderSessionRequest.setAuthenticatedFlag(true);
        senderSessionRequest.setUpdateTS(new Timestamp(new Date().getTime()));
        SenderSession senderSession = servicesRestTemplate.postForObject(baseUrl+"sendersession", senderSessionRequest, SenderSession.class);
        return senderSession;
    }

    public SenderSession updateSenderSessionForPin(SenderSession senderSessionRequest) {
        senderSessionRequest.setSessionStarted(true);
        senderSessionRequest.setAuthenticatedFlag(true);
        senderSessionRequest.setUpdateTS(new Timestamp(new Date().getTime()));
        SenderSession senderSession = servicesRestTemplate.postForObject(baseUrl+"sendersession", senderSessionRequest, SenderSession.class);
        return senderSession;
    }

    public SenderSession logoutSenderSession(SenderSession senderSessionRequest) {
        senderSessionRequest = getSenderSession(senderSessionRequest.getSenderID());
        senderSessionRequest.setSessionStarted(false);
        senderSessionRequest.setAuthenticatedFlag(false);
        senderSessionRequest.setUpdateTS(new Timestamp(new Date().getTime()));
        SenderSession senderSession = servicesRestTemplate.postForObject(baseUrl+"sendersession", senderSessionRequest, SenderSession.class);
        return senderSession;
    }

    public <T> List<T> fetchList(String jsonString, Class targetType) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.getTypeFactory().constructCollectionType(List.class, targetType);
        return mapper.readValue(jsonString, type);
    }

    public void saveSenderSession(CustomerLinkResponse customerLinkResponse) {
        SenderSession senderSession = new SenderSession();
        senderSession.setSecurePin(customerLinkResponse.getSecurePin());
        senderSession.setSenderID(customerLinkResponse.getFbId());
        senderSession.setAuthenticatedFlag(false);
        senderSession.setSessionStarted(false);
        senderSession.setLastLoginTS(new Timestamp(new Date().getTime()));
        senderSession.setUpdateTS(new Timestamp(new Date().getTime()));
        servicesRestTemplate.postForObject(baseUrl+"sendersession", senderSession, SenderSession.class);
    }


}
