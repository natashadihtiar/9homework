package natashadihtiar;

public class GoodPupil extends Pupil {
    @Override
    public void Study() {
        System.out.println("Study a lot");
    }

    @Override
    public void Read() {
        System.out.println("Read a lot");
    }

    @Override
    public void Write() {
        System.out.println("Write a lot");
    }

    @Override
    public void Relax() {
        System.out.println("Relax a lot");
    }

    public GoodPupil(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "GoodPupil" +" " + name ;
    }
}
