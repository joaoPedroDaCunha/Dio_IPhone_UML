package Entity.Telephone;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ContacAgenda {
    private Set<Contatc> contatcs;

    public ContacAgenda(){
        contatcs = new HashSet<>();
    }

    public void addContatc(String name,int number){
       contatcs.add(new Contatc(name, number)); 
    }

    public void addContatc(String name, int number, String discription){
        contatcs.add(new Contatc(name, number, discription));
    }

    public void removeContatc(String name, int number){
        if(!contatcs.isEmpty()){
            contatcs.removeIf(n -> n.getNameContact().equalsIgnoreCase(name) && n.getNumberContact() == number);
        }else{
            throw new RuntimeException("Não a contatos para apagar");
        }
    }

    public void removeContatc(Set<Contatc> removelist){
        if(!contatcs.isEmpty()){
            contatcs.removeAll(removelist);
        }else{
            throw new RuntimeException("Não a contatos para apagar");
        }
    }

    public Set<Contatc> viewContactAgenda(){
        Set<Contatc> viewContatc = new TreeSet<>(contatcs);
        return viewContatc;
    }
}
