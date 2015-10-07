package liquibasedemo;

import liquibasedemo.service.AdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class AdminController {

    private Logger logger = LoggerFactory.getLogger(AdminService.class);

    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "/admin/reindexAllMovies", method = RequestMethod.POST)
    public void reindexAllMovies() {
        logger.info("called reindexAllMovies");
        adminService.reindexAllMovies();
    }
}
