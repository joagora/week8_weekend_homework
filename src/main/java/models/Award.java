package models;

public class Award {

    private int id;
    private AwardType awardType;
    private CategoryType category;

    public Award(AwardType awardType, CategoryType category) {
        this.awardType = awardType;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AwardType getAwardType() {
        return awardType;
    }

    public void setAwardType(AwardType awardType) {
        this.awardType = awardType;
    }

    public CategoryType getCategory() {
        return category;
    }

    public void setCategory(CategoryType category) {
        this.category = category;
    }
}
