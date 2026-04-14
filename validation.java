

public class validation {
    private String title;
    private String content;
    private String category;

    public Note(String title, String content, String category) {
        if (isNullOrEmpty(title)) {
            throw new IllegalArgumentException("Nosaukums nedrīkst būt tukšs");
        }
        if (isNullOrEmpty(content)) {
            throw new IllegalArgumentException("Saturs nedrīkst būt tukšs");
        }
        if (isNullOrEmpty(category)) {
            throw new IllegalArgumentException("Kategorija nedrīkst būt tukša");
        }

        this.title = title;
        this.content = content;
        this.category = category;
    }

    private boolean isNullOrEmpty(String value) {
        return value == null || value.trim().isEmpty();
    }
   if (isNullOrEmpty(title)) {
            throw new IllegalArgumentException("Nosaukums nedrīkst būt tukšs");
        }
        if (isNullOrEmpty(content)) {
            throw new IllegalArgumentException("Saturs nedrīkst būt tukšs");
        }
        if (isNullOrEmpty(category)) {
            throw new IllegalArgumentException("Kategorija nedrīkst būt tukša");
        }

        this.title = title;
        this.content = content;
        this.category = category;
    }

    private boolean isNullOrEmpty(String value) {
        return value == null || value.trim().isEmpty();
    }
