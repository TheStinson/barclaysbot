package com.barclaycard.hackathon.befuturemind.remote;

import com.test.gen.GraphResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;

/**
 * Created by vbhatia on 11/22/2017.
 */
@Service
public class FacebookGraphService {

    @Autowired
    @Qualifier("facebookGraphRestTemplate")
    RestTemplate facebookGraphRestTemplate;

    public String getFbId(String senderId) {
        GraphResponse response = facebookGraphRestTemplate.getForObject("https://graph.facebook.com/v2.11/"
                +senderId+"/ids_for_apps?page=232811100589221&access_token=EAAbT2pUV3WYBAGSbsISSxJKtZAns982Tx1HC4GInRYLxELyZCbqCXF5bZBn3WnVQw2FZCNBquppTuOuswX6iPZA8AiZBJbljiAkMZCHshrfOMhJNM39axBAsncMhROUTp9GZABt5doZBbDzZBdoIlZAt3ZBAJhTeU2RDl6IkaWzZBgOS7LAZDZD&appsecret_proof=66400b879e7e1131cf312d842008df942a5bdcd4165936125c0e0615a0b3d329", GraphResponse.class);
        if(response.getData().isEmpty()){
            return "NOT_LINKED";
        }

        String id = response.getData().get(0).getId();
        System.out.println(id);
        return id;
    }
}
