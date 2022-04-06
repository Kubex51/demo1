package com.example.demo;


import com.example.demo.ports.Port;
import com.example.demo.ports.PortService;
import com.example.demo.windy.APIEndpoint;
import com.example.demo.windy.WindyApiParams;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping
public class Controller {

    @Autowired
    private PortService portService;

    @Autowired
    private APIEndpoint apiEndpoint;

    @Autowired
    private ParametersController parametersController;

    @GetMapping(path = "docks")
    public String findPorts(@RequestParam(required = false) String id) {

        Port port = portService.findById(Long.valueOf(id));
        return port.toString();
    }

    @GetMapping(path = "weather")
    public String getWeather(@RequestParam(required = true) String portId) throws IOException {
        Port port = portService.findById(Long.valueOf(portId));
        String lat = String.valueOf(port.getLatitude());
        String lon = String.valueOf(port.getLongitude());
        WindyApiParams windyApiParams = new WindyApiParams(
                Double.parseDouble(lat),
                Double.parseDouble(lon),
                ParametersController.getProperty("windy.model"),
                ParametersController.getArrayProperty("windy.parameters"),
                ParametersController.getArrayProperty("windy.levels"),
                ParametersController.getProperty("windy.APIKey")
        );
        CloseableHttpResponse response = apiEndpoint.getAPIResponse(windyApiParams);
        return "PortName: " + port.getName() + "\n" + EntityUtils.toString(response.getEntity());
    }
}
