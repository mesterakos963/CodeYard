package Workers;


public class DepartmentHead extends Worker {

    public DepartmentHead(String id,String bossID, String name){
        super(id, bossID, name);
    }

    public void setId(String newId){
        this.id = newId;
    }

    public void setBossID(String id){
        this.bossID = id;
    }

    @Override
    public String getBossID() {
        return bossID;
    }

    @Override
    public String getName() { return this.name; }

    public String getID(){
        return id;
    }
}
