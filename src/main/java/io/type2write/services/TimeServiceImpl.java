package io.type2write.services;

import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import org.springframework.stereotype.Service;
import io.type2write.config.TimeApiConfig;
import io.type2write.model.TimeApiResponse;

@Service
public class TimeServiceImpl implements TimeService {

    private final TimeApiConfig timeApiConfig;

    public TimeServiceImpl(TimeApiConfig timeApiConfig) {
        this.timeApiConfig = timeApiConfig;
    }

    @Override
    public String getCurrentTime(String timeZone) {
        HttpResponse<TimeApiResponse> response = Unirest.get(
                        timeApiConfig.getEndpoint() +
                                timeApiConfig.getContinent() + "/" + timeZone)
                .asObject(TimeApiResponse.class);
        return response.getBody().getUtc_datetime();
    }
}
