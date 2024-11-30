package exercise8;

public class HttpConnection {
    private String url;
    private int port;
    private String username;
    private String password;
    private int timeout;

    private HttpConnection(Builder builder) {
        this.url = builder.url;
        this.port = builder.port;
        this.username = builder.username;
        this.password = builder.password;
        this.timeout = builder.timeout;
    }

    public static class Builder {
        private String url;
        private int port = 80;
        private String username = "";
        private String password = "";
        private int timeout = 1000;

        public Builder setUrl(String url) {
            if (url == null || !url.startsWith("http")) {
                throw new IllegalArgumentException("URL must start with 'http'");
            }
            this.url = url;
            return this;
        }

        public Builder setPort(int port) {
            this.port = port;
            return this;
        }

        public Builder setUsername(String username) {
            this.username = username;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setTimeout(int timeout) {
            this.timeout = timeout;
            return this;
        }

        public HttpConnection build() {
            if (url == null) {
                throw new IllegalStateException("URL is required");
            }
            return new HttpConnection(this);
        }
    }

    @Override
    public String toString() {
        return "HttpConnection{" +
                "url='" + url + '\'' +
                ", port=" + port +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", timeout=" + timeout +
                '}';
    }
}

