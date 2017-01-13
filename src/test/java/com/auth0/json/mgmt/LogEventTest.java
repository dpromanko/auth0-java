package com.auth0.json.mgmt;

import com.auth0.json.JsonTest;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

public class LogEventTest extends JsonTest<LogEvent> {

    private static final String json = "{\"date\":\"1234567890\",\"type\":\"thetype\",\"location_info\":{},\"details\":{},\"client_id\":\"clientId\",\"client_name\":\"clientName\",\"ip\":\"233.233.233.11\",\"user_id\":\"userId\"}";

    @Test
    public void shouldDeserialize() throws Exception {
        LogEvent logEvent = fromJSON(json, LogEvent.class);

        assertThat(logEvent, is(notNullValue()));
        assertThat(logEvent.getDate(), is("1234567890"));
        assertThat(logEvent.getType(), is("thetype"));
        assertThat(logEvent.getClientId(), is("clientId"));
        assertThat(logEvent.getClientName(), is("clientName"));
        assertThat(logEvent.getIp(), is("233.233.233.11"));
        assertThat(logEvent.getUserId(), is("userId"));
        assertThat(logEvent.getLocationInfo(), is(notNullValue()));
        assertThat(logEvent.getDetails(), is(notNullValue()));
    }
}