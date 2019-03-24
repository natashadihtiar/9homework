package natashadihtiar;

public class BadPupil extends Pupil{
    public void Study() {
        System.out.println("Study a lit");
    }

    @Override
    public void Read() {
        System.out.println("Read a lit");
    }

    @Override
    public void Write() {
        System.out.println("Write a lit");
    }

    @Override
    public void Relax() {
        System.out.println("Relax a lit");
    }

    @Override
    public String toString() {
        return "BadPupil" +
                " " + name;

    }

    public BadPupil(String name) {
        super(name);
    }
}
