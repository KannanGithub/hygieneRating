package co.uk.infinityworks.hygieneRating.web.controller;

import co.uk.infinityworks.hygieneRating.service.AuthoritiesService;
import co.uk.infinityworks.hygieneRating.service.EstablishmentsService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
/**
 * @author Kannan Gnanasigamani
 *
 */
@Controller
public class HygieneRatingController {

    private static final Logger LOG = Logger.getLogger(HygieneRatingController.class);

    @Autowired
    private AuthoritiesService authoritiesService;

    @Autowired
    private EstablishmentsService establishmentsService;

    @RequestMapping(value = "/home.html")
    public ModelAndView showHomePage() {
        if (LOG.isDebugEnabled()) {
            LOG.debug("Enter: showHomePage()");
        }
        ModelAndView modelAndView = new ModelAndView("home");

        authoritiesService.getAllAuthorities();

        establishmentsService.getEstablishmentsByAuthorityId();

        if (LOG.isDebugEnabled()) {
            LOG.debug("Exit: showHomePage()");
        }
        return modelAndView;
    }
}
