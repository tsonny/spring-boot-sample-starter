package io.type2write.services;

import io.type2write.config.TimeApiConfig;
import io.type2write.model.TimeApiResponse;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import org.springframework.stereotype.Service;

@Service
public class TimeServiceImpl implements TimeService {

    private TimeApiConfig timeApiConfig;

    public TimeServiceImpl(TimeApiConfig timeApiConfig) {
        this.timeApiConfig = timeApiConfig;
    }

    @Override
    public String getCurrentTime(String timeZone) {

        TimeApiResponse response = Unirest.get(timeApiConfig.getEndpoint() + timeApiConfig.getContinent() + "/" + timeZone)
                .asObject(TimeApiResponse.class).getBody();
        return response.getUtc_datetime();
    }
}
