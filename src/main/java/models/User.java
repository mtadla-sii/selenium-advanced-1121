package models;

public class User {
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private int gender;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public int getGender() {
        return gender;
    }


    public User(String firstName, String lastName, String password, String email, int gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.gender = gender;
    }

    public static final class Builder {
        private String firstName;
        private String lastName;
        private String password;
        private String email;
        private int gender;

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder gender(int gender) {
            this.gender = gender;
            return this;
        }

        public User build() {
            if (email.isEmpty()) {
                throw new IllegalStateException("Name cannot be empty");
            }

            if (password.isEmpty()) {
                throw new IllegalStateException("Name cannot be empty");
            }
            return new User(firstName, lastName, password, email, gender);
        }
    }
}
