package hello.springmvc.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogTestController {

    private final Logger logger = LoggerFactory.getLogger(LogTestController.class);

    @RequestMapping("/log-test")
    public String logTest() {

        String name = "Spring";

        logger.trace("trace log = {}", name);
        logger.debug("trace log = {}", name);
        logger.warn("trace log = {}", name);
        logger.error("trace log = {}", name);
        logger.debug("trace log = {}", name);

        return "ok";
    }
}
