package hafta5.day;

public enum Day {
    MONDAY("09:00 - 17:00"),
    TUESDAY("09:00 - 17:00"),
    WEDNESDAY("09:00 - 17:00"),
    THURSDAY("09:00 - 17:00"),
    FRİDAY("09:00 - 17:00"),
    SATURDAY("09:00 - 14.00"),
    SUNDAY("Kapalı");

    private final String workingHours;

    Day(String workingHours) {
        this.workingHours = workingHours;
    }

    public String getWorkingHours() {
        return workingHours;
    }

}
