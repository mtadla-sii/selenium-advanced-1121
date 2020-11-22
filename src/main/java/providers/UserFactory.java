package providers;

import models.User;
import org.apache.commons.lang3.RandomStringUtils;

public class UserFactory {
    public User getAlreadyRegisteredUser() {
        return new User.Builder()
                .firstName("Jan")
                .lastName("Kowalski")
                .email("j.k@wp.pl")
                .password("qweasdzxc")
                .gender(1)
                .build();
    }

    public User getRandomUser() {
        return new User.Builder()
                .firstName(getRandomText())
                .lastName(getRandomText())
                .email(getRandomText() + "@wp.pl")
                .password(getRandomText())
                .gender(1)
                .build();
    }

    public String getRandomText() {
        return RandomStringUtils.random(7, true, false);
    }
}
