package databaseConnection;

public class DatabaseConfig {
	private String jdbcURL;
    private String jdbcUsername;
    private String jdbcPassword;

    // Constructor and getters
    public DatabaseConfig(String jdbcURL, String jdbcUsername, String jdbcPassword) {
        this.setJdbcURL("jdbc:mysql://localhost:3306/coffeshopmenu");
        this.setJdbcUsername("root");
        this.setJdbcPassword("Ramy2030");
    }

	public String getJdbcURL() {
		return jdbcURL;
	}

	public void setJdbcURL(String jdbcURL) {
		this.jdbcURL = jdbcURL;
	}

	public String getJdbcUsername() {
		return jdbcUsername;
	}

	public void setJdbcUsername(String jdbcUsername) {
		this.jdbcUsername = jdbcUsername;
	}

	public String getJdbcPassword() {
		return jdbcPassword;
	}

	public void setJdbcPassword(String jdbcPassword) {
		this.jdbcPassword = jdbcPassword;
	}

}