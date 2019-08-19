package io.alauda.nsxt.controller;

import io.alauda.nsxt.util.JsonResourceUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * Created by wjl on 2019-06-21 09:37
 */

@RestController
@RequestMapping("/api/v1")
@Slf4j
public class NsxtSubnetController {


    @RequestMapping(value = "/pools/ip-pools", method = RequestMethod.GET, produces = "application/json")
    public Object getIpPools() {
        log.info("enter : /pools/ip-pools");
        return JsonResourceUtils.getJsonObjFromResource("/json/ippool");
    }

    @RequestMapping(value = "/logical-ports", method = RequestMethod.GET, produces = "application/json")
    public Object getLogicalPorts(@RequestParam boolean container_ports_only, @RequestParam String logical_switch_id) {
        log.info("enter : /logical-ports");
        return JsonResourceUtils.getJsonObjFromResource("/json/logical-ports");
    }

    @RequestMapping(value = "/logical-switches", method = RequestMethod.GET, produces = "application/json")
    public Object getLogicalSwitches() {
        log.info("enter : /logical-switches");
        return JsonResourceUtils.getJsonObjFromResource("/json/logical-switches");
    }
}
