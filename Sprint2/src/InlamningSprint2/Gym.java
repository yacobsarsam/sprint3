package InlamningSprint2;

import java.nio.file.Path;
import java.nio.file.Paths;
public class Gym {
    //public void DoProgram(){}
    public void DoProgram(Boolean isTest,String input, Path testInPath,Path testOutpath){
        if(isTest){
            IOUtility iou = new IOUtility();
            PersonUtility pu= new PersonUtility();
            Person person = pu.GetPersonFromList(input, input, iou.ReadFromFileToList(testInPath));
            iou.CheckHistoricMemberhip(person,testOutpath);
        }
        else {
            IOUtility iou = new IOUtility();
            Path inPath = Paths.get("src/InlamningSprint2/customers.txt");
            Path outPath = Paths.get("src/InlamningSprint2/ListaTillPT.txt");
            iou.ReadFromFileToList(inPath);
            iou.ReadFromUser(outPath);
        }
    }
    public static void main(String[] args) {
         Gym g = new Gym();
         g.DoProgram(false,null,null,null);
    }
}