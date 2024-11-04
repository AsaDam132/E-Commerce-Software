package e_commerceFullStack.e_commerceFullStack.dto;

public class AuthenticationRequest {
        private String username;
        private String password;

        // Default constructor
        public AuthenticationRequest() {}

        // Parameterized constructor
        public AuthenticationRequest(String username, String password) {
            this.username = username;
            this.password = password;
        }

        // Getter for username
        public String getUsername() {
            return username;
        }

        // Getter for password
        public String getPassword() {
            return password;
        }
    }


