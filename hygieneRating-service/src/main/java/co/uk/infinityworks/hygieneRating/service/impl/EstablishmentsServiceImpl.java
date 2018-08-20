package co.uk.infinityworks.hygieneRating.service.impl;

import co.uk.infinityworks.hygieneRating.service.EstablishmentsService;
import co.uk.infinityworks.hygieneRating.service.utils.RestService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * @author Kannan Gnanasigamani
 *
 */
@Service
public class EstablishmentsServiceImpl implements EstablishmentsService {

    private static final Logger LOG = Logger.getLogger(EstablishmentsServiceImpl.class);

    @Autowired
    private RestService restService;

    public void getEstablishmentsByAuthorityId() {
        if (LOG.isDebugEnabled()) {
            LOG.debug("Enter: getEstablishmentsByAuthorityId()");
        }
        System.out.println("I am going to fetch Establishments...");
        System.out.println(restService.getBaseUrl());
        System.out.println(restService.getAuthoritiesUrl());
        System.out.println(restService.getEstablishmentsByAuthorityUrl());
        System.out.println(restService.getApiVersion());

        if (LOG.isDebugEnabled()) {
            LOG.debug("Exit: getEstablishmentsByAuthorityId()");
        }
    }
}
