package Entity.Telephone;
public class Contatc implements Comparable<Contatc>,Call{
    private String nameContact;
    private int numberContact;
    private String discriptionContact;
    
    public Contatc(String nameContact, int numberContact) {
        this.nameContact = nameContact;
        this.numberContact = numberContact;
    }

    public Contatc(String nameContact, int numberContact, String discriptionContact) {
        this.nameContact = nameContact;
        this.numberContact = numberContact;
        this.discriptionContact = discriptionContact;
    }

    public String getNameContact() {
        return nameContact;
    }

    public void setNameContact(String nameContact) {
        this.nameContact = nameContact;
    }

    public int getNumberContact() {
        return numberContact;
    }

    public void setNumberContact(int numberContact) {
        this.numberContact = numberContact;
    }

    public String getDiscriptionContact() {
        return discriptionContact;
    }

    public void setDiscriptionContact(String discriptionContact) {
        this.discriptionContact = discriptionContact;
    }

    @Override
    public String toString() {
        return "[nameContact=" + nameContact + ", numberContact=" + numberContact + ", discriptionContact="
                + discriptionContact + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + numberContact;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Contatc other = (Contatc) obj;
        if (numberContact != other.numberContact)
            return false;
        return true;
    }

    @Override
    public int compareTo(Contatc o) {
       return nameContact.compareToIgnoreCase(o.nameContact);
    }

    @Override
    public void initCall(int number) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'initCall'");
    }

    @Override
    public void endOfCall() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'endOfCall'");
    }

    
}
