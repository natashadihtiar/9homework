package natashadihtiar;

public class ClassRoom {

    Pupil pupil1;
    Pupil pupil2;
    Pupil pupil3;
    Pupil pupil4;

    public Pupil getPupil1() {
        return pupil1;
    }

    public void setPupil1(Pupil pupil1) {
        this.pupil1 = pupil1;
    }

    public Pupil getPupil2() {
        return pupil2;
    }

    public void setPupil2(Pupil pupil2) {
        this.pupil2 = pupil2;
    }

    public Pupil getPupil3() {
        return pupil3;
    }

    public void setPupil3(Pupil pupil3) {
        this.pupil3 = pupil3;
    }

    public Pupil getPupil4() {
        return pupil4;
    }

    public void setPupil4(Pupil pupil4) {
        this.pupil4 = pupil4;
    }

    public ClassRoom(String pupil1, String pupil2, String pupil3, String pupil4) {
        this.pupil1 = new ExcellenPupil(pupil1);
        this.pupil2 = new GoodPupil(pupil2);
        this.pupil3 = new BadPupil(pupil3);
        this.pupil4 = new GoodPupil(pupil4);
    }

    @Override
    public String toString() {
        return "ClassRoom" +
                "pupil1=" + pupil1 +
                ", pupil2=" + pupil2 +
                ", pupil3=" + pupil3 +
                ", pupil4=" + pupil4;
    }
    }
