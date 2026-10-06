import java.util.ArrayList;

public class Startup{
    private ArrayList<String> locationCells;
    private String name;

    public void setLocationsCells(ArrayList<String> loc){
        locationCells = loc;
    }
    public void setName(String name){
        this.name = name;
    }
    public String checkYourself(String guess){
        String result = "miss";
        int index = locationCells.indexOf(guess);
        if(index >= 0){
            locationCells.remove(index);
            if(locationCells.isEmpty()){
                result = "kill";
                System.out.println("Ouch! you sunk " + name + " : (");
            }
            else{
                result = "hit";
            }
        }
        return result;
    }
}