package builder_pattern;

public class Driver {

    public static void main(String[] args) {
        Task task = new TaskBuilder(5, null, null, false, null).setDescription("Hello").setSummary("Test").build();
        System.out.println(task);
    }
}
