package pl.ki.thy_test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.ki.thy_test.model.*;

import java.util.List;
import java.util.Map;

@Controller
public class WelcomeController {

    private String message = "Hello World";
    
    @Autowired
    CountryDAO countryDAO;

    @RequestMapping("/")
    public String welcome(Map<String, Object> model) {
        model.put("message", this.message);
        return "welcome";
    }


    @RequestMapping(value = { "/selectOptionExample0" }, method = RequestMethod.GET)
    public String selectOptionExample1Page0(Model model) {

        BillingForm form = new BillingForm();
        model.addAttribute("billingForm", form);

        List<BillingInitialDelayDTO> list = BillingInitialDelayFactory.getPossibleBillingInitialDelay();
        model.addAttribute("billingDetails", list);

        return "selectOptionExample1";
    }

    @RequestMapping(value = { "/selectOptionExample0" }, method = RequestMethod.POST)
    public String post(BillingForm billingForm) {
        System.out.println("asd");
        return "selectOptionExample0";
    }

    @RequestMapping(value = { "/selectOptionExample1" }, method = RequestMethod.GET)
    public String selectOptionExample1Page(Model model) {

        PersonForm form = new PersonForm();
        model.addAttribute("personForm", form);

        List<Country> list = countryDAO.getCountries();
        model.addAttribute("countries", list);

        return "selectOptionExample1";
    }

    @RequestMapping(value = { "/selectOptionExample2" }, method = RequestMethod.GET)
    public String selectOptionExample2Page(Model model) {

        PersonForm form = new PersonForm();
        model.addAttribute("personForm", form);

        // Long: countryId
        // String: countryName
        Map<Long, String> mapCountries = countryDAO.getMapCountries();
        model.addAttribute("mapCountries", mapCountries);

        return "selectOptionExample2";
    }

    @RequestMapping(value = { "/selectOptionExample3" }, method = RequestMethod.GET)
    public String selectOptionExample3Page(Model model) {

        PersonForm form = new PersonForm();
        model.addAttribute("personForm", form);

        // Long: countryId
        // String: countryName
        Map<Long, String> mapCountries = countryDAO.getMapCountries();
        model.addAttribute("mapCountries", mapCountries);

        return "selectOptionExample3";
    }

}