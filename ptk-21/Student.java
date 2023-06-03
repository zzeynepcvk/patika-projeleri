public class Student {
    String name;
    String stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double average;
    boolean isPass;

    public Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAverage();
        this.isPass = false;
    }

    public void addBulkExamNote(int mat, int fizik, int kimya) {
        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }
        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }
        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }
    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.average);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAverage() {
        // Sözlü notları da hesaba katılarak ortalama hesaplama
        this.average = (this.fizik.note * this.fizik.oralWeight +
                        this.kimya.note * this.kimya.oralWeight +
                        this.mat.note * this.mat.oralWeight) /
                       (this.fizik.oralWeight + this.kimya.oralWeight + this.mat.oralWeight);
    }

    public boolean isCheckPass() {
        calcAverage();
        return this.average > 55;
    }

    public void printNote() {
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu: " + this.mat.note +
                           " Matematik Sözlü Notu: " + this.mat.note * this.mat.oralWeight);
        System.out.println("Fizik Notu: " + this.fizik.note +
                           " Fizik Sözlü Notu: " + this.fizik.note * this.fizik.oralWeight);
        System.out.println("Kimya Notu: " + this.kimya.note +
                           " Kimya Sözlü Notu: " + this.kimya.note * this.kimya.oralWeight);
    }
}
