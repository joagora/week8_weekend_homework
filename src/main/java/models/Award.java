package models;

import javax.persistence.*;

@Entity
@Table(name = "awards")
public class Award {

    private int id;
    private AwardType awardType;
    private CategoryType category;

    public Award(AwardType awardType, CategoryType category) {
        this.awardType = awardType;
        this.category = category;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Enumerated(value = EnumType.STRING)
    public AwardType getAwardType() {
        return awardType;
    }

    public void setAwardType(AwardType awardType) {
        this.awardType = awardType;
    }

    @Enumerated(value = EnumType.STRING)
    public CategoryType getCategory() {
        return category;
    }

    public void setCategory(CategoryType category) {
        this.category = category;
    }
}
