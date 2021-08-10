package Workers;

public abstract class Worker {

    protected String bossID;
    protected String name;
    protected String id;

    public Worker(String id, String bossID, String name){
        this.id = id;
        this.bossID = bossID;
        this.name = name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public abstract void setId(String newID);

    public abstract String getBossID();

    public abstract String getID();

    public abstract String getName();

    @Override
    public String toString() {
        return this.name;
    }
}
