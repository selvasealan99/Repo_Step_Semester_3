package week7;
class AttendanceSheet {
    private final String[] students;
    private int count;

    public AttendanceSheet(int maxSize) {
        students = new String[maxSize];
        count = 0;
    }

    public void markPresent(String name) {
        if (!isPresent(name) && count < students.length) {
            students[count] = name;
            count++;
        }
    }

    public int getPresentCount() {
        return count;
    }

    public boolean isPresent(String name) {
        for (int i = 0; i < count; i++) {
            if (students[i].equals(name)) {
                return true;
            }
        }
        return false;
    }
}
