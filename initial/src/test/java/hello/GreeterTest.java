package hello;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

import org.joda.time.LocalTime;

public class GreeterTest {

    private Greeter greeter = new Greeter();

    @Test
    public void greeterSaysHello() {
        LocalTime currentTime = new LocalTime();
        assertThat(greeter.sayHello("" + currentTime), containsString("Hello"));
    }

}
