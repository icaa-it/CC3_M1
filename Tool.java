public class Tool {
    private String name;
    private String status;

    public Tool(String name, String status) {
        this.name = name;
        this.status = status;
    }

    public boolean isAvailable() {
        return status.equalsIgnoreCase("Available");
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
