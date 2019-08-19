package io.alauda.nsxt.controller;

import io.alauda.nsxt.util.JsonResourceUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wjl on 2019-06-21 09:37
 */

@RestController
@RequestMapping("/api")
@Slf4j
public class LocalizationController {


    @RequestMapping(value = "/user", method = RequestMethod.POST, produces = "application/json")
    public Object getIpPools() {
        log.info("enter : /api/user");
        return JsonResourceUtils.getJsonObjFromResource("/json/local");
    }
}
