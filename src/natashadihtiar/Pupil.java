package natashadihtiar;

public abstract class Pupil implements IPupil {

    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void Study(){
        System.out.println("Study ");
    }

    public void Read(){
        System.out.println("Read ");
    }

    public void Write(){
        System.out.println("Write ");
    }

    public void Relax(){
        System.out.println("Relax ");
    }

    public Pupil(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pupil"+ " " +
                 name + this.getClass();
    }

}
