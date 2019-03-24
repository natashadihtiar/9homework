package natashadihtiar;

public class ExcellenPupil extends Pupil{
    @Override
    public void Study() {
        super.Study();
        System.out.println("Study a lot");

    }

    @Override
    public void Read() {
        super.Read();
        System.out.println("Read a lot");

    }

    @Override
    public void Write() {
        super.Write();
        System.out.println("Write a lot");

    }

    @Override
    public void Relax() {
        super.Relax();
        System.out.println("Relax a lit");

    }

    public ExcellenPupil(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "ExcellentPupil " + " " + name ;
    }
}
