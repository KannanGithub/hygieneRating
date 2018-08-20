package co.uk.infinityworks.hygieneRating.service.impl;

import co.uk.infinityworks.hygieneRating.core.exceptions.FatalException;
import co.uk.infinityworks.hygieneRating.service.AuthoritiesService;
import co.uk.infinityworks.hygieneRating.service.utils.RestService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Kannan Gnanasigamani
 *
 */
@Service
public class AuthoritiesServiceImpl implements AuthoritiesService {

    private static final Logger LOG = Logger.getLogger(AuthoritiesServiceImpl.class);

    @Autowired
    private RestService restService;

    @Autowired
    private RestTemplate restTemplate;

    public void getAllAuthorities() {
        if (LOG.isDebugEnabled()) {
            LOG.debug("Enter: getAllAuthorities()");
        }
        System.out.println("I am going to fetch Authorities...." );
        System.out.println(restService.getBaseUrl());
        System.out.println(restService.getAuthoritiesUrl());
        System.out.println(restService.getEstablishmentsByAuthorityUrl());
        System.out.println(restService.getApiVersion());
        ResponseEntity<Object[]> responseEntity;
        String url = "http://jsonplaceholder.typicode.com/posts";
       try {
           responseEntity = restTemplate.exchange(url, HttpMethod.GET, null, Object[].class);
       } catch(Exception e) {
           throw new FatalException("Error occured while retrieving posts.", e.getCause());
       }

        if (LOG.isDebugEnabled()) {
            LOG.debug("Exit: getAllAuthorities()");
        }
    }
}
