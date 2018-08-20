package co.uk.infinityworks.hygieneRating.web.controller;

import co.uk.infinityworks.hygieneRating.service.AuthoritiesService;
import co.uk.infinityworks.hygieneRating.service.EstablishmentsService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.web.servlet.ModelAndView;

import static org.junit.Assert.*;
/**
 * @author Kannan Gnanasigamani
 *
 */
public class HygieneRatingControllerTest {

    private static final String HOME_PAGE = "home" ;

    @Mock
    private AuthoritiesService mockAuthoritiesService;

    @Mock
    private EstablishmentsService mockEstablishmentsService;

    @InjectMocks
    private HygieneRatingController hygieneRatingController;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void shouldShowHomePage() throws Exception {

        //when
        ModelAndView modelAndView = hygieneRatingController.showHomePage();

        //then
        assertEquals(HOME_PAGE, modelAndView.getViewName());
    }

}