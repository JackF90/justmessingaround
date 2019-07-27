public class Person {

    private String name;
    private String specialization;
    private int age;
    private int health;
    private int mana;
    private int experience;
    private int level;

    public Person() {

    }

    public Person(String name, String specialization, int age, int health, int mana, int experience, int level) {

        this.name = name;
        this.specialization = specialization;
        this.age = age;
        this.health = health;
        this.mana = mana;
        this.experience = experience;
        this.level = level;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString(){
        return "Name " + name + " Spec " + specialization;
     }
}
