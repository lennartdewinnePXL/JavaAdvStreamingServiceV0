package be.pxl.ja.streamingservice.model;

public enum Rating {
    MATURE(16),
    TEENS(12),
    OLDER_KIDS(7),
    LITTLE_KIDS(0);
    private int age;

    Rating (int age){
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
